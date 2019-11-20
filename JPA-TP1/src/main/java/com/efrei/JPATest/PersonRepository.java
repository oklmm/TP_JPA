package com.efrei.JPATest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
	
	List<Vehicule> findByName(String name);

}