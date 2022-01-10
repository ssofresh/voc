package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
//@Getter
//@Setter
@Entity
public class Compensation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;							//일련번호
	private String cost;					//배상금액
	
	@OneToOne
	@JsonBackReference //순환참조 방지
	@JoinColumn(name="COMPENSATION_VOC_ID", unique = true)
	private Voc voc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Voc getVoc() {
		return voc;
	}
	public void setVoc(Voc voc) {
		this.voc = voc;
	}
	
	
}
