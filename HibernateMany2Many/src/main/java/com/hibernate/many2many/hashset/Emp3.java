package com.hibernate.many2many.hashset;

import java.util.HashSet;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.*;
	 
@Entity
@Table(name="Emp3")
public class Emp3{
	 
@Id
private int eid;
private String ename;
@ManyToMany(cascade = { CascadeType.ALL})
@JoinTable(name = "emp3_prjt2",joinColumns = {
		@JoinColumn(name = "e_id") },inverseJoinColumns = { 
	    @JoinColumn(name = "p_id")})
		private HashSet<Prjt2> proje;
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
public HashSet<Prjt2> getProje() {
	return proje;
}
public void setProje(HashSet<Prjt2> proje) {
	this.proje = proje;
}
}
		