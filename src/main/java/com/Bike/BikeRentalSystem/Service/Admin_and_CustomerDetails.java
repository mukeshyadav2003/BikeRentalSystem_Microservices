package com.Bike.BikeRentalSystem.Service;

import org.slf4j.Logger;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bike.BikeRentalSystem.Repository.AdminAndCustomerRepository;
import com.Bike.BikeRentalSystem.Model.AdminDetails;
import com.Bike.BikeRentalSystem.Model.CustomerDetails;
import com.Bike.BikeRentalSystem.Model.CustomerReport;

@Service
public class Admin_and_CustomerDetails {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	AdminAndCustomerRepository adminAndCustomerRepository;
		


	
	public void addAdminDetails( String name, String password, int bikeno, Long mobileNo) {
		
	    logger.info("Attempting to add AddminDetails:{}",name);
		AdminDetails adminDetails = new AdminDetails(name,password,bikeno,mobileNo);
		
		adminAndCustomerRepository.save(adminDetails);
	}
	
	public void customerDetails(String name, int age, Long number, String location) {
		
		logger.info("Attempting to add CusatomerDetails:{}",name);
	    CustomerDetails customerdetails= new CustomerDetails(name,age,number,location);
		  
	    adminAndCustomerRepository.save(customerdetails);
		
	}
	public void SendReport(String name, String report, Long vechileid) {
		
		logger.info("Report Send {}",name,report,vechileid);
		CustomerReport creport = new CustomerReport(name,report,vechileid);
		
		adminAndCustomerRepository.save(creport);
		
	}
}
