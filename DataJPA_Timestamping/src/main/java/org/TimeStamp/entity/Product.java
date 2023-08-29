package org.TimeStamp.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Data;
//@Data
@Entity
@Table(name = "PRODUCT_MASTER")
public class Product {

	@Id
	@Column(name = "PRODUCT_ID")
	private int pid;
	
	@Column(name = "PRODUCT_NAME")
	private String pname;
	
	@Column (name = "PRODUCT_PRICE")
	private double price;
	
	@Column(name = "CREATED_DATE" ,updatable = false)
	private Date createdDate;
	
	@Column(name = " UPDATED_DATE" , insertable = false)
	private Date updatedDate;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
	
}
