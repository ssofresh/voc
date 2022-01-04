package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Company;

public interface CompanyRepository extends CrudRepository<Company, Integer> {

}
