package com.residencia.dell.services;

import java.util.List;

import com.residencia.dell.entities.OrderLines;
import com.residencia.dell.repositories.OrderlinesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderlinesService {
    
    @Autowired
    public OrderlinesRepository orderlinesRepository;

    public OrderLines findById(Integer id){
        return orderlinesRepository.findByOrderLinesId(id);
    }

    public List<OrderLines> findAll(){
        return orderlinesRepository.findAll();
    }

    public Long Count (){
        return orderlinesRepository.count();
    }

    public OrderLines save(OrderLines orderlines){
        return orderlinesRepository.save(orderlines);
    }

    public boolean delete(Integer id){
        if (id != null){
            orderlinesRepository.delete(orderlinesRepository.findByOrderLinesId(id));
            return true;
        }else{
            return false;
        }
    }

    public OrderLines update(OrderLines orderlines, Integer id){
        orderlines.setProdId(id); 
        return orderlinesRepository.save(orderlines);
    }


}
