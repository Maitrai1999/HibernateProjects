package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Que {
	@Id
	private int id;
	private String que_Name;
	@OneToOne
	@JoinColumn(name = "ans_ID")
	private Ans ansID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQue_Name() {
		return que_Name;
	}

	public void setQue_Name(String que_Name) {
		this.que_Name = que_Name;
	}

	public Ans getAnsID() {
		return ansID;
	}

	public void setAnsID(Ans ansID) {
		this.ansID = ansID;
	}

}
