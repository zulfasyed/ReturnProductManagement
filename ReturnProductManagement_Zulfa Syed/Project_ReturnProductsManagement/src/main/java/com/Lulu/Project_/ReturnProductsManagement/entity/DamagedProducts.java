package com.Lulu.Project_.ReturnProductsManagement.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "damagedproducts")
public class DamagedProducts {
	@Id
	int id;
	String productname;
	String customername;
	String reasontoreturn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getReasontoreturn() {
		return reasontoreturn;
	}
	public void setReasontoreturn(String reasontoreturn) {
		this.reasontoreturn = reasontoreturn;
	}
	public DamagedProducts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DamagedProducts(int id, String productname, String customername, String reasontoreturn) {
		super();
		this.id = id;
		this.productname = productname;
		this.customername = customername;
		this.reasontoreturn = reasontoreturn;
	}
	@Override
	public String toString() {
		return "DamagedProducts [id=" + id + ", productname=" + productname + ", customername=" + customername
				+ ", reasontoreturn=" + reasontoreturn + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(customername, id, productname, reasontoreturn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DamagedProducts other = (DamagedProducts) obj;
		return Objects.equals(customername, other.customername) && id == other.id
				&& Objects.equals(productname, other.productname)
				&& Objects.equals(reasontoreturn, other.reasontoreturn);
	}
	
	
	
}
