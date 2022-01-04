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
public class Compensation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;							//일련번호
	private String voc_id;		 			//voc 일련번호
	//@Column(length=1024)				
	private String compensationCost;		//배상금액
}
