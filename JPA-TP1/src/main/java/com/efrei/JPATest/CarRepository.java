package com.efrei.JPATest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
	
	List<Car> findByNumberOfSeats(int numberOfSeats);

}
