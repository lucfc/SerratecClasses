package com.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvdrental.entities.Address;
import com.dvdrental.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	public AddressRepository addressRepository;

	public Address findById(Integer id) {
		Address address = addressRepository.findById(id).get();
		return address;
	}

	public List<Address> findAll() {
		List<Address> listaAddress = addressRepository.findAll();
		return listaAddress;
	}

	public Long count() {
		Long totalAddress = addressRepository.count();
		return totalAddress;
	}

	public Address save(Address address) {
		Address novoAddress = addressRepository.save(address);

		if (novoAddress.getAddressId() != null) {
			return novoAddress;
		} else {
			return null;
		}
	}

	public Address update(Address address, Integer id) {
		address.setAddressId(id);
		// o this se refere ao addressRepository
		return this.save(address);

//		Address address = addressRepository.findById(id).get();
//		atualizarDados(address, novoAddress);
//		return addressRepository.save(address);
	}

}
