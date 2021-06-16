package com.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvdrental.entities.City;
import com.dvdrental.repositories.CityRepository;

@Service
public class CityService {
	@Autowired
	public CityRepository cityRepository;

	public City findById(Integer id) {
		City city = cityRepository.findById(id).get();
		return city;
	}

	public List<City> findAll() {
		List<City> listaCity = cityRepository.findAll();
		return listaCity;
	}

	public Long count() {
		Long totalCity = cityRepository.count();
		return totalCity;
	}

	public City save(City city) {
		City novaCity = cityRepository.save(city);

		if (novaCity.getCityId() != null) {
			return novaCity;
		} else {
			return null;
		}
	}

	public City update(City city, Integer id) {
		city.setCityId(id);
		// o this se refere ao cityRepository
		return this.save(city);

//		City city = cityRepository.findById(id).get();
//		atualizarDados(city, novaCity);
//		return cityRepository.save(city);
	}
}
