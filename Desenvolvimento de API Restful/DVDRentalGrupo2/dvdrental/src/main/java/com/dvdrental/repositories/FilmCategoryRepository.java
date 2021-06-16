package com.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvdrental.entities.FilmCategory;
import com.dvdrental.entities.FilmCategoryID;

@Repository
public interface FilmCategoryRepository extends JpaRepository<FilmCategory, FilmCategoryID> {

}
