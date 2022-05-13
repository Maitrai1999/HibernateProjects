package com.hibernate.one2many1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Trainer1 {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int t_id;
	private String t_name;
	private String t_sub;
	
	@OneToMany(mappedBy="tr")
	private List<Learner1> lr;
	
	public Trainer1(int t_id,String t_name,String t_sub,List<Learner1> lr) {
		super();
		this.t_id=t_id;
		this.t_name=t_name;
		this.t_sub=t_sub;
		this.lr=lr;
		
	}

	public Trainer1() {
		// TODO Auto-generated constructor stub
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_sub() {
		return t_sub;
	}

	public void setT_sub(String t_sub) {
		this.t_sub = t_sub;
	}

	public List<Learner1> getLr() {
		return lr;
	}

	public void setLr(List<Learner1> lr) {
		this.lr = lr;
	}

}