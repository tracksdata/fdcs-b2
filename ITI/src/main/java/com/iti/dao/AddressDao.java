package com.iti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iti.entity.Address;

public interface AddressDao extends JpaRepository<Address, Integer>{

		
}
