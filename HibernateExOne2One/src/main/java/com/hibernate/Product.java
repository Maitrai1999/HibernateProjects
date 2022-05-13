package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Product {
	@Id
	private int ProdID;
	private String Name;
	private int price;
	
	@OneToOne
	@JoinColumn(name="Supplier_Id")
	private Supplier SupplierID;

	public int getProdID() {
		return ProdID;
	}

	public void setProdID(int prodID) {
		ProdID = prodID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Supplier getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(Supplier supplierID) {
		SupplierID = supplierID;
	}
}