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
@Table(name = "film_actor")
public class FilmActor {
	
	@EmbeddedId
	FilmActorID filmActorId;
	
	@ManyToOne
	@MapsId("filmId")
	@JoinColumn(name = "film_id", referencedColumnName = "film_id")
	private Film filmId;
	
	@ManyToOne
	@MapsId("actorId")
	@JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
	private Actor actorId;
	
	@Column(name = "last_update")
	private Calendar lastUpdate;

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Film getFilmId() {
		return filmId;
	}

	public void setFilmId(Film filmId) {
		this.filmId = filmId;
	}

	public Actor getActorId() {
		return actorId;
	}

	public void setActorId(Actor actorId) {
		this.actorId = actorId;
	}

}
