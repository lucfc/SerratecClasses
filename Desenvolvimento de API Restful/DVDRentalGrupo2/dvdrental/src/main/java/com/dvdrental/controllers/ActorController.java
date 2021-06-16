package com.dvdrental.controllers;

import java.util.List;

import com.dvdrental.entities.Actor;
import com.dvdrental.services.ActorService;

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
@RequestMapping("/actor")
public class ActorController {

	@Autowired
    private ActorService actorService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Actor> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(actorService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Actor>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(actorService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	// @GetMapping
	// public ResponseEntity<List<Actor>> findAll(
	// 		@RequestParam(required = false) Integer pagina,
	// 		@RequestParam(required = false) Integer qtdRegistros) 
	// 				throws Exception {
		
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(actorService.findAll(pagina, 
	// 			qtdRegistros), headers, HttpStatus.OK);
	// }
	
	// @GetMapping("/matricula")
	// public ResponseEntity<List<Actor>> listByMatricula(@RequestParam(required = true) Integer matricula) {
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(actorService.listByMatricula(matricula), headers, HttpStatus.OK);
	// }
	
	@GetMapping("/count")
	public Long count() {
		return actorService.count();
	}
	
	@PostMapping
	public ResponseEntity<Actor> save(@RequestBody Actor actor){
		//return actorService.save(actor);
		HttpHeaders headers = new HttpHeaders();
		
		if(null != actorService.save(actor))
			return new ResponseEntity<>(actorService.save(actor), headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(actorService.save(actor), headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Actor update(Actor actor, Integer id){
       return actorService.update(actor, id);
    }
}
