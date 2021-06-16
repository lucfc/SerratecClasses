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
import org.springframework.web.bind.annotation.RestController;

import com.dvdrental.entities.Store;
import com.dvdrental.services.StoreService;

@RestController
public class StoreController {
	
	@Autowired
	
    private StoreService storeService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Store> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(storeService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Store>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(storeService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	// @GetMapping
	// public ResponseEntity<List<Store>> findAll(
	// 		@RequestParam(required = false) Integer pagina,
	// 		@RequestParam(required = false) Integer qtdRegistros) 
	// 				throws Exception {
		
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(storeService.findAll(pagina, 
	// 			qtdRegistros), headers, HttpStatus.OK);
	// }
	
	// @GetMapping("/matricula")
	// public ResponseEntity<List<Store>> listByMatricula(@RequestParam(required = true) Integer matricula) {
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(storeService.listByMatricula(matricula), headers, HttpStatus.OK);
	// }
	
	@GetMapping("/count")
	public Long count() {
		return storeService.count();
	}
	
	@PostMapping
	public ResponseEntity<Store> save(@RequestBody Store store){
		//return storeService.save(store);
		HttpHeaders headers = new HttpHeaders();
		
		if(null != storeService.save(store))
			return new ResponseEntity<>(storeService.save(store), headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(storeService.save(store), headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Store update(Store store, Integer id){
       return storeService.update(store, id);
    }

}
