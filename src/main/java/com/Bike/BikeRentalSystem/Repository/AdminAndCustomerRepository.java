package com.Bike.BikeRentalSystem.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Bike.BikeRentalSystem.Model.AdminDetails;
import com.Bike.BikeRentalSystem.Model.CustomerDetails;
import com.Bike.BikeRentalSystem.Model.CustomerReport;
import com.Bike.BikeRentalSystem.Model.Mechanic;


@Repository
public interface AdminAndCustomerRepository extends JpaRepository<AdminDetails,Long> {

	void save(CustomerReport creport);

	void save(CustomerDetails customerdetails);

	
}

