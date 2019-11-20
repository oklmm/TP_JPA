package com.efrei.JPATest;

import java.util.List;
import java.util.Date;

import org.springframework.data.repository.CrudRepository;

public interface RentRepository extends CrudRepository<Rent, Long> {
	
	List<Rent> findByBeginRent(Date beginRent);

}