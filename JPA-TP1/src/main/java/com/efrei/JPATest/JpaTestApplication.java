package com.efrei.JPATest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import javax.print.attribute.standard.PrinterLocation;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class JpaTestApplication {

	private static final Logger log = LoggerFactory.getLogger(JpaTestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(JpaTestApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(RentRepository repository) {
		return (args) -> {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = dateFormat.parse("2018-10-09");
			log.info(date.toString());
			
			Rent test  = new Rent(date,date,1);
			log.info(test.toString());
			Person prout = new Person(1, "prout");
			
			repository.save(test);
			
			log.info("Rents found with findAll():");
			log.info("-------------------------------");
			for (Rent rent : repository.findAll()) {
				log.info(rent.toString());
			}
			log.info("");

			log.info("");
			log.info("--------------------------------------------");
			repository.findByBeginRent(date).forEach(Rent -> {
				log.info(Rent.toString());
			});
			
		};
	}
}
