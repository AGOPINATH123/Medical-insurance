package com.medicalinsurance.customer.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.medicalinsurance.customer.entity.Customers;

@Component
public interface CustomerRepo extends CrudRepository<Customers, Long> {

	

}
