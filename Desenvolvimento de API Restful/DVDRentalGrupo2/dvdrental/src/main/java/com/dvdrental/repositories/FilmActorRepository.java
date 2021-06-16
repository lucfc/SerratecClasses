package com.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvdrental.entities.FilmActor;
import com.dvdrental.entities.FilmActorID;

@Repository
public interface FilmActorRepository extends JpaRepository<FilmActor, FilmActorID> {

}
