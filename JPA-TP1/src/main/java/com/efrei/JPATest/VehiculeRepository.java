package com.efrei.JPATest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
	
	List<Vehicule> findByPlateNumber(int plateNumber);

}