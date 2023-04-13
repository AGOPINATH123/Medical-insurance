package com.medicainsurance.claim.repo;
import org.springframework.data.relational.core.mapping.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.springframework.data.annotation.Id;
@Entity
@Table(name = "ClaimDetails")
public class ClaimCustomer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private String ReasonForClaim;
	
	private String ListOfHospital;	
	
	public String getReasonForClaim() {
		return ReasonForClaim;
	}
	public void setReasonForClaim(String reasonForClaim) {
		ReasonForClaim = reasonForClaim;
	}
	public String getListOfHospital() {
		return ListOfHospital;
	}
	public void setListOfHospital(String listOfHospital) {
		ListOfHospital = listOfHospital;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
}
