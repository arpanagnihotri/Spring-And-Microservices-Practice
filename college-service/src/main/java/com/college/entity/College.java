package com.college.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {
	
	@Id
	@Column(name="cid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cId;
	private String cName;
	private String cPlace;

	public College() {
		super();
	}

	public College(int cId) {
		super();
		this.cId = cId;
	}

	
	public College(int cId, String cName, String cPlace) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cPlace = cPlace;
	}

		public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcPlace() {
		return cPlace;
	}

	public void setcPlace(String cPlace) {
		this.cPlace = cPlace;
	}

	
	
	
}
