package com.dvdrental.services;

import java.util.List;

import com.dvdrental.entities.Inventory;
import com.dvdrental.repositories.InventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
	public InventoryRepository inventoryRepository;

	public Inventory findById(Integer id) {
		Inventory inventory = inventoryRepository.findById(id).get();
		return inventory;
	}

	public List<Inventory> findAll() {
		List<Inventory> listaInventory = inventoryRepository.findAll();
		return listaInventory;
	}

	public Long count() {
		Long totalInventory = inventoryRepository.count();
		return totalInventory;
	}

	public Inventory save(Inventory inventory) {
		Inventory novoInventory = inventoryRepository.save(inventory);

		if (novoInventory.getInventoryId() != null) {
			return novoInventory;
		} else {
			return null;
		}
	}

	public Inventory update(Inventory inventory, Integer id) {
		inventory.setInventoryId(id);
		// o this se refere ao inventoryRepository
		return this.save(inventory);

//		Inventory inventory = inventoryRepository.findById(id).get();
//		atualizarDados(inventory, novoInventory);
//		return inventoryRepository.save(inventory);
	}

}
