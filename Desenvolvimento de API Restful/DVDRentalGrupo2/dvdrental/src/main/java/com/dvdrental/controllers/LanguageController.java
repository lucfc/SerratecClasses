package com.dvdrental.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvdrental.entities.Inventory;
import com.dvdrental.services.InventoryService;

@RestController
@RequestMapping("/language")
public class LanguageController {
    
	@Autowired
    private InventoryService inventoryService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Inventory> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(inventoryService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Inventory>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(inventoryService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	// @GetMapping
	// public ResponseEntity<List<Inventory>> findAll(
	// 		@RequestParam(required = false) Integer pagina,
	// 		@RequestParam(required = false) Integer qtdRegistros) 
	// 				throws Exception {
		
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(inventoryService.findAll(pagina, 
	// 			qtdRegistros), headers, HttpStatus.OK);
	// }
	
	// @GetMapping("/matricula")
	// public ResponseEntity<List<Inventory>> listByMatricula(@RequestParam(required = true) Integer matricula) {
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(inventoryService.listByMatricula(matricula), headers, HttpStatus.OK);
	// }
	
	@GetMapping("/count")
	public Long count() {
		return inventoryService.count();
	}
	
	@PostMapping
	public ResponseEntity<Inventory> save(@RequestBody Inventory inventory){
		//return inventoryService.save(inventory);
		HttpHeaders headers = new HttpHeaders();
		
		if(null != inventoryService.save(inventory))
			return new ResponseEntity<>(inventoryService.save(inventory), headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(inventoryService.save(inventory), headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Inventory update(Inventory inventory, Integer id){
       return inventoryService.update(inventory, id);
    }
}
