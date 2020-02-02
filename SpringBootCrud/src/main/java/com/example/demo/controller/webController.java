package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.EmployeeBean;
import com.example.demo.service.EmployeeServiceImpl;

@Controller
public class webController {


	@Autowired
	EmployeeServiceImpl service;
	
	@RequestMapping(value="/welcome")
	public ModelAndView welcomePage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Welcome");
		return mv;
	}
	
	@RequestMapping(value="/getE")
	public ModelAndView getEmployee() {
		ModelAndView mv=new ModelAndView();
		List<EmployeeBean>li=service.getEmployee();
		mv.setViewName("EmployeeDetails");
		mv.addObject("empli", li);
		
		return mv;
	}
	
	@RequestMapping(value="/addE")
	public ModelAndView addEmployeePage() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("addemp", new EmployeeBean());
		mv.setViewName("AddEmployee2");
		
		return mv;
	}
		
	@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("addemp")EmployeeBean eb) {
		System.out.println(eb);
		System.out.println(service.addEmployee(eb));
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("AddEmployee2");
		mv.addObject("success", "Employee Added Successfully");
		return mv;
	}
	
	
}
