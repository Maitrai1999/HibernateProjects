package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String qu_name;
	
	@OneToMany(mappedBy="qu")
	private List<Answer> an;
	
	public Question(int id,String qu_name,List<Answer> an) {
		super();
		this.id=id;
		this.qu_name=qu_name;
		this.an=an;
		
	}

	public Question() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQu_name() {
		return qu_name;
	}

	public void setQu_name(String qu_name) {
		this.qu_name = qu_name;
	}

	public List<Answer> getAn() {
		return an;
	}

	public void setAn(List<Answer> an) {
		this.an = an;
	}
}
