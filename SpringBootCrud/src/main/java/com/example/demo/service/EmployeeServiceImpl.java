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
	@Override
	public String updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		Optional<EmployeeEntity> ee=dao.findById(id);
		EmployeeEntity empee=ee.get();
		EmployeeBean eb=new EmployeeBean();
		//eb.setId(empee.getId());
		//eb.setName(name);
		empee.setName(name);
		dao.save(empee);
		return "Updated Successfully";
	}
	@Override
	public List<EmployeeEntity> range(int id1, int id2) {
		// TODO Auto-generated method stub
		List<EmployeeEntity>li=dao.rangeId(id1, id2);
		return li;
	}
	@Override
	public String addEmployee(EmployeeBean eb) {
		// TODO Auto-generated method stub
		System.out.println(eb);
		EmployeeEntity ee=new EmployeeEntity();
		BeanUtils.copyProperties(eb, ee);
		dao.save(ee);
		return "Success";
	}
	@Override
	public String addEmployeeList(List<EmployeeBean> empli) {
		// TODO Auto-generated method stub
		List<EmployeeEntity>eeli=new ArrayList<EmployeeEntity>();
		
		for(EmployeeBean eb: empli) {
			EmployeeEntity ee=new EmployeeEntity();
			BeanUtils.copyProperties(eb, ee);
			eeli.add(ee);
		}
		dao.saveAll(eeli);
		
		return "Success";
	}
	

	
}
