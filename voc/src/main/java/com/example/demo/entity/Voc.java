package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;

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
	@Column(name="VOC_ID")
	private int id;							//일련번호
	private String content; 			//voc내용
	private String attributableRsn;			//귀책사유
	private String compensationRqstYn;		//배상요청여부
	
	@ManyToOne
	@JoinColumn(name="COMPANY_ID")
	private Company company;
	
	@OneToOne(mappedBy="voc")
	private Penalty penalty;
	
	@OneToOne(mappedBy="voc")
	private Compensation compensation;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAttributableRsn() {
		return attributableRsn;
	}

	public void setAttributableRsn(String attributableRsn) {
		this.attributableRsn = attributableRsn;
	}

	public String getCompensationRqstYn() {
		return compensationRqstYn;
	}

	public void setCompensationRqstYn(String compensationRqstYn) {
		this.compensationRqstYn = compensationRqstYn;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Penalty getPenalty() {
		return penalty;
	}

	public void setPenalty(Penalty penalty) {
		this.penalty = penalty;
	}

	public Compensation getCompensation() {
		return compensation;
	}

	public void setCompensation(Compensation compensation) {
		this.compensation = compensation;
	}
	
	
	
}
