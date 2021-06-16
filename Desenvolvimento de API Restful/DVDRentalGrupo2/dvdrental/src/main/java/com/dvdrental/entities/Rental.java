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
@Table(name = "rental")
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rental_id")
	private Integer rentalId;

	@Column(name = "rental_date")
	private Calendar rentalDate;

	@Column(name = "return_date")
	private Calendar returnDate;

	@Column(name = "last_update")
	private Calendar lastUpdate;
	
	@OneToOne
	@JoinColumn(name = "inventory_id", referencedColumnName = "inventory_id")
	private Inventory inventory;
	
	@OneToMany(mappedBy = "rental")
	private List<Payment> payment;
	
	@ManyToOne
	@JoinColumn(name = "staff_id", referencedColumnName = "staff_id")
	private Staff staff;
	
	@OneToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;

	public Integer getRentalId() {
		return rentalId;
	}

	public void setRentalId(Integer rentalId) {
		this.rentalId = rentalId;
	}

	public Calendar getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(Calendar rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Calendar getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Calendar returnDate) {
		this.returnDate = returnDate;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
