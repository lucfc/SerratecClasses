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

import com.dvdrental.entities.Film;
import com.dvdrental.services.FilmService;

@RestController
@RequestMapping("/film")
public class FilmController {

	@Autowired
    private FilmService filmService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Film> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(filmService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Film>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(filmService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	// @GetMapping
	// public ResponseEntity<List<Film>> findAll(
	// 		@RequestParam(required = false) Integer pagina,
	// 		@RequestParam(required = false) Integer qtdRegistros) 
	// 				throws Exception {
		
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(filmService.findAll(pagina, 
	// 			qtdRegistros), headers, HttpStatus.OK);
	// }
	
	// @GetMapping("/matricula")
	// public ResponseEntity<List<Film>> listByMatricula(@RequestParam(required = true) Integer matricula) {
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(filmService.listByMatricula(matricula), headers, HttpStatus.OK);
	// }
	
	@GetMapping("/count")
	public Long count() {
		return filmService.count();
	}
	
	@PostMapping
	public ResponseEntity<Film> save(@RequestBody Film film){
		//return filmService.save(film);
		HttpHeaders headers = new HttpHeaders();
		
		if(null != filmService.save(film))
			return new ResponseEntity<>(filmService.save(film), headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(filmService.save(film), headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Film update(Film film, Integer id){
       return filmService.update(film, id);
    }	
}
