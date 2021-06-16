package com.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvdrental.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
