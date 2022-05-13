package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ans {
	@Id
	private int ans_Id;
	private String ans_Solution;
	public int getAns_Id() {
		return ans_Id;
	}
	public void setAns_Id(int ans_Id) {
		this.ans_Id = ans_Id;
	}
	public String getAns_Solution() {
		return ans_Solution;
	}
	public void setAns_Solution(String ans_Solution) {
		this.ans_Solution = ans_Solution;
	}
}

