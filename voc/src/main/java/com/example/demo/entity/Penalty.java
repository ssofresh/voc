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
public class Penalty {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;							//일련번호
	private String voc_id; 					//voc일련번호
	//@Column(length=1024)				
	private String penaltyCost;				//페널티비용
	private String confirmYn;				//확인여부
	private String objectionYn;				//이의제기여부
	private String objectionRsn;			//이의제기사유
}
