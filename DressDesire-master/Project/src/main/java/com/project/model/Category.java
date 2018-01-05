package com.project.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int cid;
private String categoryDetails;
@OneToMany(mappedBy="category")
private List<Product> products;
public int getCid() {
	return cid;
	
}
public String getCategoryDetails() {
	return categoryDetails;
}
public void setCategoryDetails(String categoryDetails) {
	this.categoryDetails = categoryDetails;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
public void setCid(int cid) {
	this.cid = cid;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}}
