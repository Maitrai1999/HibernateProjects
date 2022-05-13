package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Emp1")
public class Emp1 {
		
		@Id
		@Column(name="eid")
		private int eid;
		@Column(name="ename")
		private String ename;
		@Column(name="esal")
		private long esal;
		@Column(name="ecity")
		private String ecity;
		@Column(name="edeg")
		private String edeg;
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
		public long getEsal() {
			return esal;
		}
		public void setEsal(long esal) {
			this.esal = esal;
		}
		public String getEcity() {
			return ecity;
		}
		public void setEcity(String ecity) {
			this.ecity = ecity;
		}
		public String getEdeg() {
			return edeg;
		}
		public void setEdeg(String edeg) {
			this.edeg = edeg;
		}
}

