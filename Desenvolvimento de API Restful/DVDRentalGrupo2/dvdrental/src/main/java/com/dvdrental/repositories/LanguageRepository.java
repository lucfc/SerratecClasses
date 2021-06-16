package com.dvdrental.repositories;

import com.dvdrental.entities.Language;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {
    
}
