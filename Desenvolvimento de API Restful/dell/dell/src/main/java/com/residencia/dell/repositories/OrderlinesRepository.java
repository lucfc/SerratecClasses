package com.residencia.dell.repositories;

import com.residencia.dell.entities.OrderLines;
import com.residencia.dell.entities.OrderLinesId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderlinesRepository extends JpaRepository<OrderLines, OrderLinesId> {

     OrderLines findByOrderLinesId(Integer orderlineId);
}
