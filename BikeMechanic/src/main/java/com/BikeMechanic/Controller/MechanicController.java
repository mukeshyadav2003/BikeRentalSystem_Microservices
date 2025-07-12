package com.BikeMechanic.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.BikeMechanic.Model.Mechanic;
import com.BikeMechanic.Service.MechanicService;



@RestController
@RequestMapping("/bike")
public class MechanicController {
	
	@Autowired
	MechanicService mechanicService;
                                            
	 @PostMapping("/AddMechanic")
	 public String addMechanic(@RequestParam("name")String name,
                               @RequestParam("rating") int rating,
                               @RequestParam("address") String adress,
                               @RequestParam("availabletime") int availabletime,
                               @RequestParam("number") Long number){
                            	   
		 mechanicService.AddMechanic(name,rating,adress,availabletime,number);
		 
		 return "Succefully Added";
                               }


	 @GetMapping("/MechanicList")
	 public List<Mechanic> getMechanicList(@RequestParam("address") String Address){
		 
		 return mechanicService.getMechanicList(Address);
		 
	 }
	 
	 @PostMapping("/MechanicReport")
	 public String mechanicService(@RequestParam("name") String name,
			                       @RequestParam("Report") String Report,
			                       @RequestParam("bikeno") int bikeno,
			                       @RequestParam("Repaircharge") float charge) {
		  
		              mechanicService.MechanicService(name,Report,bikeno,charge);
		 
									return "BikeDetails";
		 
	 }
}

