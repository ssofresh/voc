package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entity.Customer;

@RestController
public class CustomerController {

	private CustomerRepository repository;

	public CustomerController(CustomerRepository repository) {
		super();
		this.repository = repository;
	}
	
	@PostMapping("/customer/save")
	public Customer postCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	@PutMapping("/customer/update")
	public Customer putCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	@DeleteMapping("/customer/delete")
	public void deleteCustomer(int id) {
		repository.deleteById(id);
	}
	
//	@GetMapping("/customer")
//	public Customer getCustomer(int id) {
//		return repository.findById(id).orElse(null);
//	}
	
	@GetMapping("/customer/get")
	public List<Customer> getCustomerList() {
		return (List<Customer>) repository.findAll();
	}
}
