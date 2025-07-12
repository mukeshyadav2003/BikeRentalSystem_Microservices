package com.BikeMechanic.Service;


import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.BikeMechanic.Model.Mechanic;
import com.BikeMechanic.Model.MechanicReport;
import com.BikeMechanic.Repository.MechanicRepository;

@Service
public class MechanicService {

	Logger logger =LoggerFactory.getLogger(getClass());
	
	
	@Autowired
	MechanicRepository mechanicRepository;
	

	
	
	public void AddMechanic(String name, int rating, String adress, int availabletime, Long number) {

		logger.info("Adding mechanic details {}",name);
        Mechanic mechanic = new Mechanic(name,rating,adress,availabletime,number);
        
        mechanicRepository.save(mechanic);
       		
	}
	

	public List<Mechanic> getMechanicList(String address) {
		
		logger.info("Get mechanic Details address{}",address);
		return mechanicRepository.findAddressesByPostalCodeNative(address);
		
	}


	public void MechanicService(String name, String report, int bikeno, float charge) {
	
		MechanicReport MReport = new MechanicReport(name,report,bikeno,charge);
		
	     mechanicRepository.save(MReport);
	}
	



}