package com.medicalinsurance.customer.controller;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.medicalinsurance.customer.entity.Customers;
import com.medicalinsurance.customer.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	 CustomerService service;
	
	
	@PostMapping("/custometrs")
	public ModelAndView Inserdetails(Customers cust) {
		service.Savedetails(cust);		
		ModelAndView mv=new ModelAndView();			
		Set<Object>list=service.getInsertDetailsInView(cust);
		
		mv.addObject("data", list);
		mv.setViewName("Detailsview");		
		return mv;
	}	
	
	@GetMapping("/custometrs/{ide}")
	public String getById(@RequestParam("ide") long uid) {
		ModelAndView mv=new ModelAndView();			
		Customers cs=service.findbyid(uid);
		mv.addObject("data", cs);
		return "Detailsview";
	}
	
}
