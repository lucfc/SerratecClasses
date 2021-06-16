package com.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dvdrental.entities.Rental;
import com.dvdrental.repositories.RentalRepository;

public class RentalService {
	@Autowired
	public RentalRepository rentalRepository;

	public Rental findById(Integer id) {
		Rental rental = rentalRepository.findById(id).get();
		return rental;
	}

	public List<Rental> findAll() {
		List<Rental> listaRental = rentalRepository.findAll();
		return listaRental;
	}

	public Long count() {
		Long totalRental = rentalRepository.count();
		return totalRental;
	}

	public Rental save(Rental rental) {
		Rental novoRental = rentalRepository.save(rental);

		if (novoRental.getRentalId() != null) {
			return novoRental;
		} else {
			return null;
		}
	}

	public Rental update(Rental rental, Integer id) {
		rental.setRentalId(id);
		// o this se refere ao rentalRepository
		return this.save(rental);

//		Rental rental = rentalRepository.findById(id).get();
//		atualizarDados(rental, novoRental);
//		return rentalRepository.save(rental);
	}
}
