package com.Biikes.Bikes_section.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Biikes.Bikes_section.Module.Bike;
import com.Biikes.Bikes_section.Repository.BikeRentalRepository;


@Service
public class bikedetails {

	Logger logger =LoggerFactory.getLogger(getClass());
	
	@Autowired
	BikeRentalRepository bikerentalrepository;
	
	
      Bike bike;
	
	public void addBikeDetails( String bikename, double rent, int bikeno, String condtion,int count,String status) {

		logger.info("Attempting to adddBikeDetails {}",bikename);
		Bike bike = new Bike(bikename,rent,bikeno,condtion,count,status);
		bikerentalrepository.save(bike);
		
		}
	
	public List<Bike> getBikeDetails() {
				  		
		logger.info("Attempting to adddBikeDetails");
		return bikerentalrepository.findAll();
		
	}
}