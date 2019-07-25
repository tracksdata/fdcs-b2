package com.cts.product.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cts.product.entities.Account;
import com.cts.product.entities.Product;

@Configuration
@ComponentScan(basePackages = { "com.cts.product.service,com.cts.product.dao" })
@PropertySource(value = { "classpath:application.properties" })
@EnableTransactionManagement
public class AppConfig {

	@Autowired
	private Environment env;

	@Bean
	public DataSource getDataSource() {

		BasicDataSource dataSource = new BasicDataSource();

		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));

		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {

		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(getDataSource());

		Properties props = new Properties();
		props.setProperty("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
		props.setProperty("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
		props.setProperty("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
		props.setProperty("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));

		sf.setHibernateProperties(props);

		sf.setAnnotatedClasses(Product.class, Account.class);

		return sf;
	}

	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager tm = new HibernateTransactionManager();

		tm.setSessionFactory(getSessionFactory().getObject());

		return tm;

	}

}
