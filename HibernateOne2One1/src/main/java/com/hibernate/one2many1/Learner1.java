package com.hibernate.one2many1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Learner1 {
	@Id
	private int l_id;
	private String l_name;
	private String l_course;
	
	@ManyToOne
	private Trainer1 tr;
	
	public Learner1(int l_id,String l_name,String l_course,Trainer1 tr) {
	       super();
	       this.l_id=l_id;
           this.l_name=l_name;
           this.l_course=l_course;	
	       this.tr=tr;

}

	public Learner1() {
		// TODO Auto-generated constructor stub
	}

	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getL_course() {
		return l_course;
	}

	public void setL_course(String l_course) {
		this.l_course = l_course;
	}

	public Trainer1 getTr() {
		return tr;
	}

	public void setTr(Trainer1 tr) {
		this.tr = tr;
	}

}