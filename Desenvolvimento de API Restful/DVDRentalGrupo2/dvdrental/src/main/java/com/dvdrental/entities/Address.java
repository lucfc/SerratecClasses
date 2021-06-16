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
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Integer addressId;

	@Column(name = "address")
	private String address;

	@Column(name = "address2")
	private String address2;

	@Column(name = "district")
	private String district;

	@Column(name = "postal_code")
	private String postalCode;

	@Column(name = "phone")
	private String phone;

	@Column(name = "last_update")
	private Calendar lastUpdate;
	
	@OneToMany(mappedBy = "address")
	private List<Customer> listCustomer;
	
	@OneToMany(mappedBy = "address")
	private List<Staff> listStaff;
	
	@ManyToOne
	@JoinColumn(name = "city_id", referencedColumnName = "city_id")
	private City city;
	
	@OneToMany(mappedBy = "address")
	private List<Store> listStore;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<Staff> getListStaff() {
		return listStaff;
	}

	public void setListStaff(List<Staff> listStaff) {
		this.listStaff = listStaff;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<Store> getListStore() {
		return listStore;
	}

	public void setListStore(List<Store> listStore) {
		this.listStore = listStore;
	}

	public List<Customer> getListCustomer() {
		return listCustomer;
	}

	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}
}
