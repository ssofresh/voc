package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Penalty;

public interface PenaltyRepository extends CrudRepository<Penalty, Integer> {

}
