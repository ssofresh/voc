package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.VocRepository;
import com.example.demo.entity.Voc;

@RestController
public class VocController {

	private VocRepository repository;

	public VocController(VocRepository repository) {
		super();
		this.repository = repository;
	}
	
	@PostMapping("/Voc/save")
	public Voc postVoc(Voc Voc) {
		return repository.save(Voc);
	}
	
	@PutMapping("/Voc/update")
	public Voc putVoc(Voc Voc) {
		return repository.save(Voc);
	}
	
	@DeleteMapping("/Voc/delete")
	public void deleteVoc(int id) {
		repository.deleteById(id);
	}
	
//	@GetMapping("/Voc")
//	public Voc getVoc(int id) {
//		return repository.findById(id).orElse(null);
//	}
	
	@GetMapping("/Voc/get")
	public List<Voc> getVocList() {
		return (List<Voc>) repository.findAll();
	}
}
