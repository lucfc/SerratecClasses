package com.dvdrental.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staff_id")
	private Integer staffId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "last_update")
	private Calendar lastUpdate;

	@Column(name = "picture")
	private Byte picture;
	
	@OneToMany(mappedBy = "staff")
	private List<Rental> listRental;
	
	@OneToMany(mappedBy = "staff")
	private List<Payment> payment;
	
	@ManyToOne
	@JoinColumn(name = "address_id", referencedColumnName = "address_id")
	private Address address;
	
	@OneToOne
	@JoinColumn(name = "store_id", referencedColumnName = "store_id")
	private Store store;

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer id) {
		this.staffId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Byte getPicture() {
		return picture;
	}

	public void setPicture(Byte picture) {
		this.picture = picture;
	}

	public List<Rental> getListRental() {
		return listRental;
	}

	public void setListRental(List<Rental> listRental) {
		this.listRental = listRental;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
}
