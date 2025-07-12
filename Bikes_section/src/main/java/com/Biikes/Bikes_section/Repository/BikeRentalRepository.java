package com.Biikes.Bikes_section.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Biikes.Bikes_section.Module.Bike;


@Repository
public interface BikeRentalRepository extends JpaRepository<Bike,Long> {
		
}