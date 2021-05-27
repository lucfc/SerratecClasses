package com.residencia.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "idade", defaultValue = "12") Integer idade) {
		return String.format("Hello %s!  Idade: %d", name, idade);
	}
	
	@GetMapping("/hello/{name}/{idade}")
	public String helloName(@PathVariable String name, @PathVariable Integer idade) {
//		return String.format("Hello %s! - Idade: %d", name, idade);
		return "Nome: " + name + "Idade: " + idade;
	}

}
