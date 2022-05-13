package com.hibernate.many2many.join;

	import java.util.List;

	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinTable;
	import javax.persistence.ManyToMany;
	import javax.persistence.Table;
	import javax.persistence.*;
	 
	@Entity
	@Table(name="Emp2")
	public class Emp2{
	 
		@Id	
		private int eid;
		private String ename;
			
		@ManyToMany(cascade = { CascadeType.ALL})
		@JoinTable(name = "emp2_prjt1",joinColumns = { 
	    @JoinColumn(name = "eid") },inverseJoinColumns = { 
	    @JoinColumn(name = "pid")})
		private List<Prjt1> proj;

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

		public List<Prjt1> getProj() {
			return proj;
		}

		public void setProj(List<Prjt1> proj) {
			this.proj = proj;
		}

}
