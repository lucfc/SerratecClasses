package com.dvdrental.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "store")
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_id")
	private Integer storeId;

	@Column(name = "manager_staff_id")
	private Integer managerStaffId;

	@Column(name = "last_update")
	private Calendar lastUpdate;
	
	@ManyToOne
	@JoinColumn(name = "address_id", referencedColumnName = "address_id")
	private Address address;
	
	@OneToOne(mappedBy = "store")
	private Staff staff;

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getManagerStaffId() {
		return managerStaffId;
	}

	public void setManagerStaffId(Integer managerStaffId) {
		this.managerStaffId = managerStaffId;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
}
