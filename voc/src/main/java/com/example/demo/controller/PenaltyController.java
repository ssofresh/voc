package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PenaltyRepository;
import com.example.demo.entity.Penalty;

@RestController
public class PenaltyController {

	private PenaltyRepository repository;

	public PenaltyController(PenaltyRepository repository) {
		super();
		this.repository = repository;
	}
	
	@PostMapping("/Penalty/save")
	public Penalty postPenalty(Penalty Penalty) {
		return repository.save(Penalty);
	}
	
	@PutMapping("/Penalty/update")
	public Penalty putPenalty(Penalty Penalty) {
		return repository.save(Penalty);
	}
	
	@DeleteMapping("/Penalty/delete")
	public void deletePenalty(int id) {
		repository.deleteById(id);
	}
	
//	@GetMapping("/Penalty")
//	public Penalty getPenalty(int id) {
//		return repository.findById(id).orElse(null);
//	}
	
	@GetMapping("/Penalty/get")
	public List<Penalty> getPenaltyList() {
		return (List<Penalty>) repository.findAll();
	}
}
