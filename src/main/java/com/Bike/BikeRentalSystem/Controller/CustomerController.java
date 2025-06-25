package com.Bike.BikeRentalSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Bike.BikeRentalSystem.Service.Admin_and_CustomerDetails;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class CustomerController {

	@Autowired
	Admin_and_CustomerDetails admin_and_CustomerDetails;
	
	//----------------------Admin Details--------------------------------------------  *
	
	@PostMapping("/AdminDetails")
	public String addAdminDetails(@RequestParam("name")String name,
                                  @RequestParam("password") String password,
                                  @RequestParam("RcBookNo") int bikeno,
                                  @RequestParam("mobileNo") Long mobileNo){
                                	   
                                	   
		admin_and_CustomerDetails.addAdminDetails(name,password,bikeno,mobileNo);
                                	   
                                	   return "Succefully add "+name + "Details";
                                   }
	

	//-------------------------Customer Details--------------------------------------------- *
	
	@PostMapping("/Customerdetails")
	public String AddCustomerDetails( @RequestParam("name")String name, 
                                      @RequestParam("age") int age,
                                      @RequestParam("number") Long number,
                                      @RequestParam("location") String location) {
                                    	  
		admin_and_CustomerDetails.customerDetails(name,age,number,location);
                                    	  
	          return name + "added";
	          
	}
		 
	 //-------------------------Customer Report------------------------------------------- *
	 
	 @PostMapping("/CustomerReport")
	 public String SendReport(@RequestParam("customerName")String name,
                              @RequestParam("Report") String Report,
                              @RequestParam("vechileid") Long vechileid) {
		 
		 admin_and_CustomerDetails.SendReport(name,Report,vechileid);
		 
		return "Addedd...";
		 
	 }
	 	 }
