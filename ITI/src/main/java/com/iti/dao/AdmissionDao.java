package com.iti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iti.entity.Admission;
public interface AdmissionDao extends JpaRepository<Admission, Integer>{

		
}
