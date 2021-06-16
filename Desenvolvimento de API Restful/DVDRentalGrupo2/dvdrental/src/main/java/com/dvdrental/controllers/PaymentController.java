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

import com.dvdrental.entities.Actor;
import com.dvdrental.services.ActorService;

public class PaymentController {
	@Autowired
    private ActorService paymentService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Actor> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(paymentService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Actor>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(paymentService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	// @GetMapping
	// public ResponseEntity<List<Actor>> findAll(
	// 		@RequestParam(required = false) Integer pagina,
	// 		@RequestParam(required = false) Integer qtdRegistros) 
	// 				throws Exception {
		
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(paymentService.findAll(pagina, 
	// 			qtdRegistros), headers, HttpStatus.OK);
	// }
	
	// @GetMapping("/matricula")
	// public ResponseEntity<List<Actor>> listByMatricula(@RequestParam(required = true) Integer matricula) {
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(paymentService.listByMatricula(matricula), headers, HttpStatus.OK);
	// }
	
	@GetMapping("/count")
	public Long count() {
		return paymentService.count();
	}
	
	@PostMapping
	public ResponseEntity<Actor> save(@RequestBody Actor payment){
		//return paymentService.save(payment);
		HttpHeaders headers = new HttpHeaders();
		
		if(null != paymentService.save(payment))
			return new ResponseEntity<>(paymentService.save(payment), headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(paymentService.save(payment), headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Actor update(Actor payment, Integer id){
       return paymentService.update(payment, id);
    }
}
