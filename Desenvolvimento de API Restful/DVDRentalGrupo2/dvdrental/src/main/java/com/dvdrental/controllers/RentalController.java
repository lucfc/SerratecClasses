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

import com.dvdrental.entities.Rental;
import com.dvdrental.services.RentalService;

public class RentalController {
	
	@Autowired
    private RentalService rentalService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Rental> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(rentalService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Rental>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(rentalService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	// @GetMapping
	// public ResponseEntity<List<Rental>> findAll(
	// 		@RequestParam(required = false) Integer pagina,
	// 		@RequestParam(required = false) Integer qtdRegistros) 
	// 				throws Exception {
		
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(rentalService.findAll(pagina, 
	// 			qtdRegistros), headers, HttpStatus.OK);
	// }
	
	// @GetMapping("/matricula")
	// public ResponseEntity<List<Rental>> listByMatricula(@RequestParam(required = true) Integer matricula) {
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(rentalService.listByMatricula(matricula), headers, HttpStatus.OK);
	// }
	
	@GetMapping("/count")
	public Long count() {
		return rentalService.count();
	}
	
	@PostMapping
	public ResponseEntity<Rental> save(@RequestBody Rental rental){
		//return rentalService.save(rental);
		HttpHeaders headers = new HttpHeaders();
		
		if(null != rentalService.save(rental))
			return new ResponseEntity<>(rentalService.save(rental), headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(rentalService.save(rental), headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Rental update(Rental rental, Integer id){
       return rentalService.update(rental, id);
    }

}
