package com.residencia.dell.controllers;

import com.residencia.dell.entities.Orders;
import com.residencia.dell.vo.NotafiscalVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/notafiscal")
public interface NotaficalController {
    
    @Autowired 
    private NotafiscalVO notafiscalVO;

  
}