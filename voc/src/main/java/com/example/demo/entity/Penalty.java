package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
//@Getter
//@Setter
@Entity
@DynamicUpdate
public class Penalty {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PENALTY_ID")
	private int id;							//일련번호
	@Column(updatable=false)
	private String penaltyCost;				//페널티비용
	
	private String confirmYn;				//확인여부
	@Column(updatable=false)
	private String objectionYn;				//이의제기여부
	@Column(updatable=false)
	private String objectionRsn;			//이의제기사유
	
	@OneToOne
	@JsonBackReference //순환참조 방지
	@JoinColumn(name="PENALTY_VOC_ID", updatable=false, unique = true)
	private Voc voc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPenaltyCost() {
		return penaltyCost;
	}

	public void setPenaltyCost(String penaltyCost) {
		this.penaltyCost = penaltyCost;
	}

	public String getConfirmYn() {
		return confirmYn;
	}

	public void setConfirmYn(String confirmYn) {
		this.confirmYn = confirmYn;
	}

	public String getObjectionYn() {
		return objectionYn;
	}

	public void setObjectionYn(String objectionYn) {
		this.objectionYn = objectionYn;
	}

	public String getObjectionRsn() {
		return objectionRsn;
	}

	public void setObjectionRsn(String objectionRsn) {
		this.objectionRsn = objectionRsn;
	}

	public Voc getVoc() {
		return voc;
	}

	public void setVoc(Voc voc) {
		this.voc = voc;
	}
	
}
