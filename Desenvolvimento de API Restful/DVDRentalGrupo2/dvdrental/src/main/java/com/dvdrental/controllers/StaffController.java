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

import com.dvdrental.entities.Staff;
import com.dvdrental.services.StaffService;

public class StaffController {
	@Autowired
    private StaffService staffService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Staff> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(staffService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Staff>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(staffService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	// @GetMapping
	// public ResponseEntity<List<Staff>> findAll(
	// 		@RequestParam(required = false) Integer pagina,
	// 		@RequestParam(required = false) Integer qtdRegistros) 
	// 				throws Exception {
		
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(staffService.findAll(pagina, 
	// 			qtdRegistros), headers, HttpStatus.OK);
	// }
	
	// @GetMapping("/matricula")
	// public ResponseEntity<List<Staff>> listByMatricula(@RequestParam(required = true) Integer matricula) {
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(staffService.listByMatricula(matricula), headers, HttpStatus.OK);
	// }
	
	@GetMapping("/count")
	public Long count() {
		return staffService.count();
	}
	
	@PostMapping
	public ResponseEntity<Staff> save(@RequestBody Staff staff){
		//return staffService.save(staff);
		HttpHeaders headers = new HttpHeaders();
		
		if(null != staffService.save(staff))
			return new ResponseEntity<>(staffService.save(staff), headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(staffService.save(staff), headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Staff update(Staff staff, Integer id){
       return staffService.update(staff, id);
    }
    
}
