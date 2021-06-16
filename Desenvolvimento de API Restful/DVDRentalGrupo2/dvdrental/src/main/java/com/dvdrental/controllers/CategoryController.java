package com.dvdrental.controllers;

import java.util.List;

import com.dvdrental.entities.Category;
import com.dvdrental.services.CategoryService;

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
@RequestMapping("/category")
public class CategoryController {

	@Autowired
    private CategoryService categoryService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(categoryService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(categoryService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	// @GetMapping
	// public ResponseEntity<List<Category>> findAll(
	// 		@RequestParam(required = false) Integer pagina,
	// 		@RequestParam(required = false) Integer qtdRegistros) 
	// 				throws Exception {
		
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(categoryService.findAll(pagina, 
	// 			qtdRegistros), headers, HttpStatus.OK);
	// }
	
	// @GetMapping("/matricula")
	// public ResponseEntity<List<Category>> listByMatricula(@RequestParam(required = true) Integer matricula) {
	// 	HttpHeaders headers = new HttpHeaders();
	// 	return new ResponseEntity<>(categoryService.listByMatricula(matricula), headers, HttpStatus.OK);
	// }
	
	@GetMapping("/count")
	public Long count() {
		return categoryService.count();
	}
	
	@PostMapping
	public ResponseEntity<Category> save(@RequestBody Category category){
		//return categoryService.save(category);
		HttpHeaders headers = new HttpHeaders();
		
		if(null != categoryService.save(category))
			return new ResponseEntity<>(categoryService.save(category), headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(categoryService.save(category), headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Category update(Category category, Integer id){
       return categoryService.update(category, id);
    }
}
