package com.dvdrental.services;

import java.util.List;

import com.dvdrental.entities.Customer;
import com.dvdrental.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	public CustomerRepository customerRepository;

	public Customer findById(Integer id) {
		Customer customer = customerRepository.findById(id).get();
		return customer;
	}

	public List<Customer> findAll() {
		List<Customer> listaCustomer = customerRepository.findAll();
		return listaCustomer;
	}

	public Long count() {
		Long totalCustomer = customerRepository.count();
		return totalCustomer;
	}

	public Customer save(Customer customer) {
		Customer novoCustomer = customerRepository.save(customer);

		if (novoCustomer.getCustomerId() != null) {
			return novoCustomer;
		} else {
			return null;
		}
	}

	public Customer update(Customer customer, Integer id) {
		customer.setCustomerId(id);
		// o this se refere ao customerRepository
		return this.save(customer);

//		Customer customer = customerRepository.findById(id).get();
//		atualizarDados(customer, novoCustomer);
//		return customerRepository.save(customer);
	}

}
