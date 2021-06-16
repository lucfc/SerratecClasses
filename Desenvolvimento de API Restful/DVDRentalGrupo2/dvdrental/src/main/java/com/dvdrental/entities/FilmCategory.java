package com.dvdrental.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "film_category")
public class FilmCategory {
	
	@EmbeddedId
	FilmCategoryID filmCategoryId;
	
	@Column(name = "last_update")
	private Calendar lastUpdate;
	
	@ManyToOne
	@MapsId("categoryId")
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	private Category categoryId;
	
	@ManyToOne
	@MapsId("filmId")
	@JoinColumn(name = "film_id", referencedColumnName = "film_id")
	private Film filmId;

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	public Film getFilmId() {
		return filmId;
	}

	public void setFilmId(Film filmId) {
		this.filmId = filmId;
	}


}
