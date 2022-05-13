package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	private int a_id;
	private String a_name;
	
	@ManyToOne
	private Question qu;
	
	public Answer(int a_id,String a_name,Question qu) {
	       super();
	       this.a_id=a_id;
        	this.a_name=a_name;
	       this.qu=qu;

}

	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public Question getQu() {
		return qu;
	}

	public void setQu(Question qu) {
		this.qu = qu;
	}
}