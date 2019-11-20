package com.efrei.JPATest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VanRepository extends CrudRepository<Van, Long> {
	
	List<Van> findByMaxWeight(int maxWeight);

}
