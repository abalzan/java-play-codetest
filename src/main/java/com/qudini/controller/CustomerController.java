package com.qudini.controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.qudini.model.Customer;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	Comparator<Customer> DUE_DATE_ORDER = Comparator.comparing(Customer::getDuetime);

	@ResponseStatus(HttpStatus.OK)
	@PostMapping
	public Flux<Customer> orderCustomers (@RequestBody List<Customer> customers){
		return Flux.fromStream(customers.stream().sorted(DUE_DATE_ORDER));
	}
}
