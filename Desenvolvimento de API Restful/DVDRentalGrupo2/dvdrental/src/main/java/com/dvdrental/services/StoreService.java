package com.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dvdrental.entities.Store;
import com.dvdrental.repositories.StoreRepository;

public class StoreService {
	@Autowired
	public StoreRepository storeRepository;

	public Store findById(Integer id) {
		Store store = storeRepository.findById(id).get();
		return store;
	}

	public List<Store> findAll() {
		List<Store> listaStore = storeRepository.findAll();
		return listaStore;
	}

	public Long count() {
		Long totalStore = storeRepository.count();
		return totalStore;
	}

	public Store save(Store store) {
		Store novoStore = storeRepository.save(store);

		if (novoStore.getStoreId() != null) {
			return novoStore;
		} else {
			return null;
		}
	}

	public Store update(Store store, Integer id) {
		store.setStoreId(id);
		// o this se refere ao storeRepository
		return this.save(store);

//		Store store = storeRepository.findById(id).get();
//		atualizarDados(store, novoStore);
//		return storeRepository.save(store);
	}
}
