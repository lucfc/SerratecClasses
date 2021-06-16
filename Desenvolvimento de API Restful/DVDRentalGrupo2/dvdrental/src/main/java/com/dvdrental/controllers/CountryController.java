package com.dvdrental.controllers;

import java.util.List;

import com.dvdrental.entities.Country;
import com.dvdrental.services.CountryService;

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

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
    private CountryService countryService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Country> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(countryService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Country>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(countryService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	// @GetMapping
	// public ResponseEntity<List<Country>> findAll(
	// 		@RequestParam(required = false) Integer pagina,
	// 		@RequestParam(required = false) Integer qtdRegistros) 
	// 				throws Exception {
		
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(countryService.findAll(pagina, 
	// 			qtdRegistros), headers, HttpStatus.OK);
	// }
	
	// @GetMapping("/matricula")
	// public ResponseEntity<List<Country>> listByMatricula(@RequestParam(required = true) Integer matricula) {
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(countryService.listByMatricula(matricula), headers, HttpStatus.OK);
	// }
	
	@GetMapping("/count")
	public Long count() {
		return countryService.count();
	}
	
	@PostMapping
	public ResponseEntity<Country> save(@RequestBody Country country){
		//return countryService.save(country);
		HttpHeaders headers = new HttpHeaders();
		
		if(null != countryService.save(country))
			return new ResponseEntity<>(countryService.save(country), headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(countryService.save(country), headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Country update(Country country, Integer id){
       return countryService.update(country, id);
    }
}
