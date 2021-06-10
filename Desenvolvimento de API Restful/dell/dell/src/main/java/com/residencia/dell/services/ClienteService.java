package com.residencia.dell.services;

import java.util.HashMap;
import java.util.Map;

import com.residencia.dell.vo.ConsultarCEPVO;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ClienteService {
  public static ConsultarCEPVO consultarDadosPorCEP(Integer CEP) {
	RestTemplate restTemplate = new RestTemplate();
	String uri = "viacep.com.br/ws/{cep}/json/";	
	Map<String, Integer> params = new HashMap<String, Integer>();
	params.put("cep", CEP);
		
	ConsultarCEPVO consultarCEPVO = restTemplate.getForObject(uri, ConsultarCEPVO.class, params);
		
	return consultarCEPVO;
  }
}