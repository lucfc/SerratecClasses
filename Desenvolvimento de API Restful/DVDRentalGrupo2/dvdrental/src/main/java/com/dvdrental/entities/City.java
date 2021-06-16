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
@Table(name = "city")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private Integer cityId;

	@Column(name = "city")
	private String city;

	@Column(name = "last_update")
	private Calendar lastUpdate;
	
	@OneToMany(mappedBy = "city")
	private List<Address> listAddress;
	
	@ManyToOne
	@JoinColumn(name = "country_id", referencedColumnName = "country_id")
	private Country country;

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<Address> getListAddress() {
		return listAddress;
	}

	public void setListAddress(List<Address> listAddress) {
		this.listAddress = listAddress;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
