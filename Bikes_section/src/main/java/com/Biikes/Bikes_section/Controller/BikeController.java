package com.Biikes.Bikes_section.Controller;

import java.util.ArrayList;




import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Biikes.Bikes_section.Module.Bike;
import com.Biikes.Bikes_section.Service.bikedetails;


@RestController
@RequestMapping("/bike")
public class BikeController {
	
	@Autowired
	bikedetails Bikedetails;
	
	private static final Logger log = LoggerFactory.getLogger(BikeController.class);

	// ----------------------Admin Enter Details About Bike--------------------------- *
	
	@PostMapping("/AdminPosting")
	public  String addBikeDetails(@RequestParam("bikename")String bikename,
			                      @RequestParam("rent") double rent,
			                      @RequestParam("bikeno") int bikeno,    
			                      @RequestParam("condtion") String condtion,
			                      @RequestParam("count")int count,
			                      @RequestParam("status")String status) {
		
		Bikedetails.addBikeDetails(bikename,rent,bikeno,condtion,count,status);   
		
		return bikename+"Succefully Add Bike Details";
		
		
	}
	
	
	// -----------------------Customer Get BikeDetails --------------------------------- *
	@GetMapping("/bikedetails")
	public ResponseEntity<List<Bike>> getAvailableBikes() {
		System.out.println(">> Reached BikeController /BikeDetails----------------------------------");
	    try {
	        List<Bike> bikes = Bikedetails.getBikeDetails();
	        return ResponseEntity.ok(bikes);
	    } catch (DataAccessException e) {
	        log.error("Database error while fetching bikes", e);
	        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
	               .body(new ArrayList<>());
	    } catch (Exception e) {
	        log.error("Unexpected error while fetching bikes", e);
	        return ResponseEntity.internalServerError()
	               .body(new ArrayList<>());
	    }
	}
	
}