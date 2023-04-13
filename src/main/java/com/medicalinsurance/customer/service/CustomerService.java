package com.medicalinsurance.customer.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.medicalinsurance.customer.entity.Customers;

public interface CustomerService {

	
	void Savedetails(Customers cust);

	public Set<Object> getInsertDetailsInView(Customers customer) ;

	//void savedata(Customers cust);

	void savedata(Customers cust);


	Customers findbyid(long ide);





}
