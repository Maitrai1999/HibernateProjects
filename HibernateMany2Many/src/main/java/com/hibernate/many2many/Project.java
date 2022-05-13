package com.hibernate.many2many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String name;
	
	@ManyToMany(mappedBy="Project")
	private List<Employee1> employee1;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee1> getEmployee1() {
		return employee1;
	}

	public void setEmployee1(List<Employee1> employee1) {
		this.employee1 = employee1;
	}
	
}
