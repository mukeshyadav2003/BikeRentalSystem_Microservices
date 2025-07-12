package com.BikeMechanic.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.BikeMechanic.Model.Mechanic;
import com.BikeMechanic.Model.MechanicReport;


@Repository
public interface MechanicRepository extends JpaRepository<Mechanic,Long> {

	@Query(value = "SELECT * FROM mechanic WHERE address = :address", nativeQuery = true)
    List<Mechanic> findAddressesByPostalCodeNative(String address);

	void save(MechanicReport mReport);
	

}
