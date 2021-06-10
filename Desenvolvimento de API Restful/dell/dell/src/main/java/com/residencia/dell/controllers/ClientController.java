package com.residencia.dell.controllers;

import com.residencia.dell.services.ClienteService;
import com.residencia.dell.vo.ConsultarCEPVO;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep/{CEP}")
public class ClientController {
    
    @GetMapping
	public ResponseEntity<ConsultarCEPVO> consultarDadosPorCEP(@PathVariable Integer CEP) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(ClienteService.consultarDadosPorCEP(CEP) ,headers, HttpStatus.OK);
	}
}
