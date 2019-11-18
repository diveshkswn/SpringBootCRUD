package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeEntity;

@Repository
public interface EmployeeDAO extends JpaRepository<EmployeeEntity,Integer> {

	
	
}
