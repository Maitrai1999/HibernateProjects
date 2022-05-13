package com.hibernate.namedquery;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({ @NamedQuery(name = "findemByID", query = "from Em e where e.eid=:eid")}) 
@Entity
@Table(name = "Em", catalog = "dbhibernate")

public class Em {
	@Id	
	private int eid;
	private String ename;
	private String ecity;
	
	public Em(int eid, String ename, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity=ecity;
			
	}
	public Em() {
		
	}
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
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	@Override
	public String toString() {
		return "Em [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + "]";
	} 
	
}
