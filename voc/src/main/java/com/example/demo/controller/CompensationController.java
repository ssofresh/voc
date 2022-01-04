package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CompanyRepository;
import com.example.demo.dao.CompensationRepository;
import com.example.demo.entity.Compensation;

@RestController
public class CompensationController {

	private CompensationRepository repository;
	private CompanyRepository companyRepository;

	public CompensationController(CompensationRepository repository) {
		super();
		this.repository = repository;
	}
	
	@PostMapping("/Compensation/save")
	public Compensation postCompensation(Compensation Compensation) {
		return repository.save(Compensation);
	}
	
	@PutMapping("/Compensation/update")
	public Compensation putCompensation(Compensation Compensation) {
		return repository.save(Compensation);
	}
	
	@DeleteMapping("/Compensation/delete")
	public void deleteCompensation(int id) {
		repository.deleteById(id);
	}
	
//	@GetMapping("/Compensation")
//	public Compensation getCompensation(int id) {
//		return repository.findById(id).orElse(null);
//	}
	
	@GetMapping("/Compensation/get")
	public List<Compensation> getCompensationList() {
		return (List<Compensation>) repository.findAll();
	}
}
