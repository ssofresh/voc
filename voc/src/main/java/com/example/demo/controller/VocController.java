package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CompensationRepository;
import com.example.demo.dao.PenaltyRepository;
import com.example.demo.dao.VocRepository;
import com.example.demo.dto.CompensationDto;
import com.example.demo.entity.Company;
import com.example.demo.entity.Compensation;
import com.example.demo.entity.Penalty;
import com.example.demo.entity.Voc;

@RestController
public class VocController {

	private VocRepository vocRepository;
	private PenaltyRepository penaltyRepository;
	private CompensationRepository compensationRepository;

	public VocController(VocRepository vocRepository, PenaltyRepository penaltyRepository,
			CompensationRepository compensationRepository) {
		super();
		this.vocRepository = vocRepository;
		this.penaltyRepository = penaltyRepository;
		this.compensationRepository = compensationRepository;
	}
	
	//VOC 목록
	@GetMapping("/voc/list")
	public List<Voc> getVocList() {
		return (List<Voc>) vocRepository.findAll();
	}
	
	//배상 목록
	@GetMapping("/compensation/list")
	public List<CompensationDto> getCompensationList() {
		ModelMapper modelMapper = new ModelMapper();
		
		List<Compensation> compensationList = (List<Compensation>)compensationRepository.findAll();
		List<CompensationDto> compensationDtoList =  modelMapper.map(compensationList, new TypeToken<List<CompensationDto>>() {}.getType());
		
		return compensationDtoList;
	}
	
	//VOC 등록
	@PostMapping("/voc/save")
	public Voc postVoc(Voc voc, int companyId) {
		Company company = new Company();
		company.setId(companyId);
		voc.setCompany(company);
		return vocRepository.save(voc);
	}
	
	//패널티 등록
	@PostMapping("/penalty/save")
	public Penalty postPenalty(Penalty penalty, int vocId) {
		Voc voc = new Voc();
		voc.setId(vocId);
		penalty.setVoc(voc);
		return penaltyRepository.save(penalty);
	}
	
	//배송기사 패널티 확인 여부 등록
	@PutMapping("/penalty/update")
	public Penalty putPenalty(Penalty penalty) {
		return penaltyRepository.save(penalty);
	}
	
	
	//배상정보 등록
	@PostMapping("/compensation/save")
	public Compensation postCompensation(Compensation compensation, int vocId) {
		Voc voc = new Voc();
		voc.setId(vocId);
		compensation.setVoc(voc);
		return compensationRepository.save(compensation);
	}
	
}
