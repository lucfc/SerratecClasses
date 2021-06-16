package com.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvdrental.entities.Country;
import com.dvdrental.repositories.CountryRepository;

@Service
public class CountryService {
	@Autowired
	public CountryRepository countryRepository;

	public Country findById(Integer id) {
		Country country = countryRepository.findById(id).get();
		return country;
	}

	public List<Country> findAll() {
		List<Country> listaCountry = countryRepository.findAll();
		return listaCountry;
	}

	public Long count() {
		Long totalCountry = countryRepository.count();
		return totalCountry;
	}

	public Country save(Country country) {
		Country novoCountry = countryRepository.save(country);

		if (novoCountry.getCountryId() != null) {
			return novoCountry;
		} else {
			return null;
		}
	}

	public Country update(Country country, Integer id) {
		country.setCountryId(id);
		// o this se refere ao countryRepository
		return this.save(country);

//		Country country = countryRepository.findById(id).get();
//		atualizarDados(country, novoCountry);
//		return countryRepository.save(country);
	}
}
