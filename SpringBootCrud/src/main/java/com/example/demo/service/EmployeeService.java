package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.EmployeeBean;
import com.example.demo.entity.EmployeeEntity;

public interface EmployeeService {

	public List<EmployeeBean> getEmployee();
	
	
	public EmployeeBean getEmployeeById(int id);
	public String addEmployee(EmployeeBean eb);
	public String addEmployeeList(List<EmployeeBean> empli);
	public String updateEmployee(int id,String name);
	public List<EmployeeEntity> range(int id1,int id2);
	
}
