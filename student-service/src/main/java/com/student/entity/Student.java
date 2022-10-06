package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="stid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stId;
	
	@Column(name="stname")
	private String stName;
	
	@Column(name="stmarks")
	private String stMarks;
	
	@ManyToOne
	@JoinColumn(name="cid")
	private College college;


	public Student() {
		super();
	}


	public Student(int stId, String stName, String stMarks, College college) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.stMarks = stMarks;
		this.college = college;
	}



	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStMarks() {
		return stMarks;
	}

	public void setStMarks(String stMarks) {
		this.stMarks = stMarks;
	}



	public College getCollege() {
		return college;
	}



	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", stMarks=" + stMarks + ", college=" + college.getcId() + "]";
	}

		
	
}
