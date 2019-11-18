package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.EmployeeBean;
import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entity.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	public EmployeeDAO dao;
	@Override
	public List<EmployeeBean> getEmployee() {
		// TODO Auto-generated method stub
		
		List<EmployeeEntity>empli=dao.findAll();
		List<EmployeeBean>li=new ArrayList<EmployeeBean>();
		for(EmployeeEntity ee:empli) {
			EmployeeBean eb=new EmployeeBean();
			BeanUtils.copyProperties(ee, eb);
			li.add(eb);
		}
		return li;
	}
	@Override
	public EmployeeBean getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Optional<EmployeeEntity> ee=dao.findById(id);
		System.out.println(ee);
		EmployeeBean eb=new EmployeeBean();
		EmployeeEntity empee=ee.get();
		BeanUtils.copyProperties(empee, eb);
		
		return eb;
	}
	

	
}
