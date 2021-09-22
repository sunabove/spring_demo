package com.example.demo.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CustomerController {

	@Autowired
	CustomerRepository repository;

	@SuppressWarnings("static-access")
	@RequestMapping("/Customer.html")
	public String customer(Model model) {

		var repository = this.repository;
		var log = this.log;
		
		if( repository.count() < 10 ) { 
			// Insert customers
			repository.save(new Customer("Jack", "Jane"));
			repository.save(new Customer("Chloe", "Brain"));
			repository.save(new Customer("MyKim", "Jeae"));
			repository.save(new Customer("John", "Price"));
			repository.save(new Customer("Adam", "Bane"));
			
			log.info("Customers inserted()");
		}

		// fetch all customers
		log.info("Customers found with findAll():");
		log.info("-------------------------------");

		ArrayList<Customer> customers = new ArrayList<>();

		for (Customer customer : repository.findAll()) {
			customers.add(customer);
			log.info("" + customer);
		}
		log.info("");

		// fetch an individual customer by ID
		Customer customer = repository.findById(1L);
		log.info("Customer found with findById(1L):");
		log.info("--------------------------------");
		log.info("" + customer);
		log.info("");

		// fetch customers by last name
		log.info("Customer found with findByLastName('Jane'):");
		log.info("--------------------------------------------");
		repository.findByLastName("Jane").forEach(jane -> {
			log.info("" + jane);
		});

		log.info("");

		model.addAttribute("result", "Good");

		model.addAttribute("customers", customers);

		return "Customer.html";
	}
}