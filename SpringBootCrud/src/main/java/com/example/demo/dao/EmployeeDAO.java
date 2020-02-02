package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeEntity;

@Repository
public interface EmployeeDAO extends JpaRepository<EmployeeEntity,Integer> {

	
	
	@Query("select k from EmployeeEntity k where k.id between :x1 and :x2")
	public List<EmployeeEntity> rangeId(@Param("x1")int id1,@Param("x2") int id2);
	
}
