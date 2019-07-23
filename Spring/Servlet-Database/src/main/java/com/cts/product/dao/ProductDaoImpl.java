package com.cts.product.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entities.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	public void saveProduct(Product prod) {

		sf.getCurrentSession().save(prod);

	}

	public Product findById(String prodId) {
		return sf.getCurrentSession().get(Product.class, prodId);
	}

	public List<Product> findProductsByName(String prodName) {
		String q1 = "from Product prod where prod.prodName like '" + prodName + "'";
		Query<Product> qry = sf.getCurrentSession().createQuery(q1, Product.class);
		return qry.list();
	}

	public List<Product> findAll() {
		String q1 = "from Product";
		Query<Product> qry = sf.getCurrentSession().createQuery(q1, Product.class);
		return qry.list();
	}

	public Product updateProduct(Product prod) {
		return (Product) sf.getCurrentSession().merge(prod);
	}

}
