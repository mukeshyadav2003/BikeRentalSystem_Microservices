package com.Bike.BikeRentalSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Bike.BikeRentalSystem.Model.AdminDetails;
import com.Bike.BikeRentalSystem.Model.CustomerDetails;
import com.Bike.BikeRentalSystem.Model.CustomerReport;


@Repository
public interface AdminAndCustomerRepository extends JpaRepository<AdminDetails,Long> {

	void save(CustomerReport creport);

	void save(CustomerDetails customerdetails);

	
}

