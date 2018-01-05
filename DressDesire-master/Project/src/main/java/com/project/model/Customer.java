package com.project.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer implements Serializable   //implemented serilizable for cart daoimpl
{ 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	
	@NotEmpty
private String firstname;
	
private String lastname;

@Column(unique=true,nullable=false)
@NotEmpty
@Email
private String email;

@Size(min=10,max=10)
private String phone;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="user_id")
@Valid
private Users users;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="billing_id")
@Valid
private BillingAddress billingAddress;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="shipping_id")
@Valid
private ShippingAddress shippingAddress;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="cart_id")
@Valid
private static  Cart cart;              //changed to static due to cart controller
private String customerOrder;
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public Users getUsers() {
	return users;
}

public void setUsers(Users users) {
	this.users = users;
}

public BillingAddress getBillingAddress() {
	return billingAddress;
}

public void setBillingAddress(BillingAddress billingAddress) {
	this.billingAddress = billingAddress;
}

public ShippingAddress getShippingAddress() {
	return shippingAddress;
}

public void setShippingAddress(ShippingAddress shippingAddress) {
	this.shippingAddress = shippingAddress;
}

public static Cart getCart() {
	return cart;
}

public void setCart(Cart cart) {
	this.cart = cart;
}

public String getCustomerOrder() {
	return customerOrder;
}

public void setCustomerOrder(String customerOrder) {
	this.customerOrder = customerOrder;
}

}