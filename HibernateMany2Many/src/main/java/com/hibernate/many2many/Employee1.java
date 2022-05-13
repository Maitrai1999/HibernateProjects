package com.hibernate.many2many;

import java.util.List;
 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="Employee1")
public class Employee1{
 
	@Id	
	private int eid;
	private String ename;
		
	@ManyToMany
    private List<Project> Project;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<Project> getProject() {
		return Project;
	}

	public void setProject(List<Project> project) {
		this.Project = project;
	}
}