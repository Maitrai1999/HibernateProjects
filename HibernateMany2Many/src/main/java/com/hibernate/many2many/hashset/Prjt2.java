package com.hibernate.many2many.hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Prjt2 {

	@Id
	@Column(name="p_Id")
	private int p_Id;
	@Column(name="p_Title")
	private String p_Title;
	
	@ManyToMany(mappedBy = "proje")
	private HashSet<Emp3> emp;

	public int getP_Id() {
		return p_Id;
	}

	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}

	public String getP_Title() {
		return p_Title;
	}

	public void setP_Title(String p_Title) {
		this.p_Title = p_Title;
	}

	public HashSet<Emp3> getEmp() {
		return emp;
	}

	public void setEmp(HashSet<Emp3> emp) {
		this.emp = emp;
	}
}
	