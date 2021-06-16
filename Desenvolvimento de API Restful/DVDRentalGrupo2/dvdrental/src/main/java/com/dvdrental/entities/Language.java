package com.dvdrental.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "language")
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "language_id")
	private Integer languageId;

	@Column(name = "name")
	private String name;

	@Column(name = "last_update")
	private Calendar lastUpdate;

	// language-film
	@OneToMany(mappedBy = "language")
	private List<Film> listFilm;

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<Film> getListFilm() {
		return listFilm;
	}

	public void setListFilm(List<Film> listFilm) {
		this.listFilm = listFilm;
	}

}
