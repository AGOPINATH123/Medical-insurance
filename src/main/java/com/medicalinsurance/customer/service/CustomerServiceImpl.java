package com.medicalinsurance.customer.service;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.medicalinsurance.customer.entity.Customers;
import com.medicalinsurance.customer.repo.CustomerRepo;

@Service
@Component
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepo repo;

	@Override
	public void Savedetails(Customers cust) {

		repo.save(cust);
	}

	@Override
	public void savedata(Customers cust) {
	}
	
 
	//static Map<Object, String> map = new LinkedHashMap<Object, String>();

	public Set<Object> getInsertDetailsInView(Customers cust) {
		
		String[] tableDetails = { "UID = ", "Cmr_Name = ", "Cmr_Age = ", "Cmr_Gender = ", "Cmr_mobile = ",
				"Cmr_Email = ", "Cmr_Aadhar = ", "Cmr_Address = ", "Cmr_qualification = " ,
				"Sp_Name = ", "Sp_Age = " + "Sp_Gender = ", "Sp_mobile = ", "Sp_Email = ", "Sp_Aadhar = ",
				"Sp_Address = ", "Sp_qualification = ", "Sp_No_ofChildren = ", "ch1_Name = ", "ch1_Age = ", "ch2_Name = ",
				"ch2_Age = ", "No_ofDependents = " + "Dp1_Name = ", "Dp1_Age = ", "Dp1_Gender = ", "Dp1_Aadhar = ",
				"Dp1_qualification = ", "Dp1_Relation = ", "Dp2_Name = ", "Dp2_Age = ", "Dp2_Gender = ", "Dp2_Aadhar = ",
				"Dp2_qualification = ", "Dp2_Relation = " };
		
		Object[] obj = { cust.getUID(), cust.getCmr_Name(), cust.getCmr_Age(), cust.getCmr_Gender(),
				cust.getCmr_mobile(), cust.getCmr_Email(), cust.getCmr_Aadhar(), cust.getCmr_Address(),
				cust.getCmr_qualification(), cust.getSp_Name(), cust.getSp_Age(),
			    cust.getSp_Gender(), cust.getSp_mobile(), cust.getSp_Email(),
				cust.getSp_Aadhar(), cust.getSp_Address(), cust.getSp_qualification(),
				cust.getSp_No_ofChildren(), cust.getCh1_Name(), cust.getCh1_Age(), cust.getCh2_Name(),
				cust.getCh2_Age(), cust.getSp_No_ofDependents(), cust.getDp1_Name(), cust.getDp1_Age(),
				cust.getDp1_Gender(), cust.getDp1_Aadhar(), cust.getDp1_qualification(),
				cust.getDp1_Relation(), cust.getDp2_Name(), cust.getDp2_Age(), cust.getDp2_Gender(),
				cust.getDp2_Aadhar(), cust.getDp2_qualification(),
				cust.getDp2_Relation() };
		
		Set<Object> kll=new LinkedHashSet<>();
		for (int i = 0; i < obj.length; i++) {
			if(obj[i]!=null ) {
				kll.add(obj[i]);
			}	
		}				
		System.out.println(kll);
		//tableDetails[i]
		return kll;
	}

	@Override
	public  Customers findbyid(long ide) {		
		
		return repo.findById(ide).get();
	}

	

}
