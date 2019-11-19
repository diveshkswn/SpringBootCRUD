package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.EmployeeBean;

public interface EmployeeService {

	public List<EmployeeBean> getEmployee();
	
	
	public EmployeeBean getEmployeeById(int id);
	
	public String updateEmployee(int id,String name);
}
