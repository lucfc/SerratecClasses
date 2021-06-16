package com.dvdrental.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FilmActorID implements Serializable {
	
	@Column(name = "film_id")
	Integer filmId;
	
	@Column(name = "actor_id")
	Integer actorId;
	
}
