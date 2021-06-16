package com.dvdrental.repositories;

import com.dvdrental.entities.Rental;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Integer> {
    
}
