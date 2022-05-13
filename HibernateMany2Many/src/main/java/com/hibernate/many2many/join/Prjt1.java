package com.hibernate.many2many.join;

	import java.util.List;
	import java.util.Set;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.ManyToMany;

	@Entity
	public class Prjt1 {

		@Id
		@Column(name="p_Id")
		private int p_Id;
		@Column(name="p_Title")
		private String p_Title;
		
		@ManyToMany(mappedBy = "proj")
		private List<Emp2> emp;

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

		public List<Emp2> getEmp() {
			return emp;
		}

		public void setEmp(List<Emp2> emp) {
			this.emp = emp;
		}
	}

