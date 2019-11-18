package com.example.demo.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employees") 
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeWrapper {

	@XmlElement(name="EmployeeBean")
	public List<EmployeeBean> emp;

	public EmployeeWrapper() {
		//super();
	}

	public EmployeeWrapper(List<EmployeeBean> emp) {
		//super();
		this.emp = emp;
	}

	public List<EmployeeBean> getEmp() {
		return emp;
	}

	public void setEmp(List<EmployeeBean> emp) {
		this.emp = emp;
	}
	
	
	
}
