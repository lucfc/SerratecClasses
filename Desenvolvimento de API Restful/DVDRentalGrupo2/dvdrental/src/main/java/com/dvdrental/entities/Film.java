package com.dvdrental.entities;

import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
@Table(name = "film")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id")
	private Integer filmId;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "release_year")
	private Integer releaseYear;

	@Column(name = "rental_duration")
	private Integer rentalDuration;

	@Column(name = "rental_rate")
	private Integer rentalRate;

	@Column(name = "length")
	private Integer length;

	@Column(name = "replacement_cost")
	private Integer replacementCost;

	@Column(name = "last_update")
	private Calendar lastupdate;

	@Column(name = "special_features")
	private String specialFeatures;

	@Column(name = "fulltext")
	private String fulltext;
	
	@ManyToOne
	@JoinColumn(name = "language_id", referencedColumnName = "language_id")
	private Language language;
	
	@OneToMany(mappedBy = "film")
	private List<Inventory> listInventory;
	
	@OneToMany(mappedBy = "filmId")
	private Set<FilmActor> setFilmActor = new HashSet<>();
	
	@OneToMany(mappedBy = "filmId")
	private Set<FilmCategory> setFilmCategory = new HashSet<>();
	
	public Integer getFilmId() {
		return filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Integer getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(Integer rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public Integer getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(Integer rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(Integer replacementCost) {
		this.replacementCost = replacementCost;
	}

	public Calendar getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(Calendar lastupdate) {
		this.lastupdate = lastupdate;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public String getFulltext() {
		return fulltext;
	}

	public void setFulltext(String fulltext) {
		this.fulltext = fulltext;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public List<Inventory> getListInventory() {
		return listInventory;
	}

	public void setListInventory(List<Inventory> listInventory) {
		this.listInventory = listInventory;
	}
	
}
