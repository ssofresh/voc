package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
//@Getter
//@Setter
@Entity
public class Company {
	@Id
	@Column(name="COMPANY_ID")
	private int id; 				//사업장코드
	private String name;				//사업장명
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return name;
	}
	public void setCompanyName(String companyName) {
		this.name = companyName;
	}
}
