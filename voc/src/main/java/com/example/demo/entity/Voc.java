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
public class Voc {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;							//일련번호
	private String voc_content; 			//voc내용
	//@Column(length=1024)				
	private String attributableRsn;			//귀책사유
	private String compensationRqstYn;		//배상요청여부
	private String transportCompany;		//운송사
	private String transportDriverId;		//기사 정보
	private String customerCompany;			//고객사
	private String customerManagerId;		//고객사 담당자 정보
	private String attributableCompany;		//귀책 당사자
}
