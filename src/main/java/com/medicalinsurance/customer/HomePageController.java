package com.medicalinsurance.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomePageController {
	@GetMapping(value = "/go")
	public String Homepage() {
		
	return "MedicalHome";
	
	}
}