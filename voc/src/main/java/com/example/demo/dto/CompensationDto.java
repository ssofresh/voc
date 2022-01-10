package com.example.demo.dto;

import com.example.demo.entity.Voc;

public class CompensationDto {
	private int id;							//일련번호
	private String cost;		//배상금액
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



	@Override
	public String toString() {
		return "Compensation2 [id=" + id + ", cost=" + cost + ", voc=" + voc + "]";
	}
	
	
}
