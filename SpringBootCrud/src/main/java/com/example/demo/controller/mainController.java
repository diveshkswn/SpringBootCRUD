package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.EmployeeBean;
import com.example.demo.bean.EmployeeWrapper;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
public class mainController {

	@Autowired
	EmployeeServiceImpl service;
	
	
	@GetMapping("/")
	public String test() {
		return "<h1>Spring Boot Application!!!</h1> <br><br> /getEmployee <br> /getEmployee2"
				+ " <br> /getEmployeeById/{ids} <br> /range/{id1}/{id2}";
	}
	
	@RequestMapping(value="/getEmployee",produces=MediaType.APPLICATION_XML_VALUE)
	public EmployeeWrapper getEmployee(){
		EmployeeWrapper ew=new EmployeeWrapper();
		ew.setEmp(service.getEmployee());
		return ew;
	}
	
	@GetMapping("/getEmployee2")
	public List<EmployeeBean> getEmployee2(){
		return service.getEmployee();
	}
	
	
	@GetMapping("/getEmployeeById/{ids}")
	public EmployeeBean getEmployeeById(@PathVariable(name="ids") int id) {
		System.out.println(id);
		EmployeeBean eb=service.getEmployeeById(id);
		return eb;
	}
	
	@GetMapping("updateEmployee/{ids}/{names}")
	public String updateEmployeeById(@PathVariable(name="ids")int id,@PathVariable(name="names") String name) {
		System.out.println(id+name);
		return service.updateEmployee(id, name);
		
	}
	
	@RequestMapping(value="/range/{id1}/{id2}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeEntity> getRangeId(@PathVariable("id1")int id1,@PathVariable("id2") int id2) {
		
		return service.range(id1, id2);
	}
	
	@RequestMapping(value="/addEmp", consumes=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	public String addEmp(@RequestBody EmployeeBean eb) {
		return service.addEmployee(eb);
	}
	
	
	@RequestMapping(value="/addEmplist", consumes=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	public String addEmpList(@RequestBody List<EmployeeBean> ebli) {
		return service.addEmployeeList(ebli);
		
	
	}
	
	
}
