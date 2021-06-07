package com.residencia.dell.services;

import com.residencia.dell.entities.Customers;
import com.residencia.dell.entities.Orderlines;
import com.residencia.dell.entities.Orders;
import com.residencia.dell.entities.Products;
import com.residencia.dell.vo.NotafiscalVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotafiscalService {
    

    @Autowired
    public Orders orders;
    
    @Autowired
    public Customers customers;

    @Autowired
    public Orderlines orderlines;
    
    @Autowired
    public Products products;

    public NotafiscalVO emitirnf(Orders orderId){

        NotafiscalVO notafiscalVO = new NotafiscalVO();

        notafiscalVO.setName(customers.getFirstName());
        notafiscalVO.setLastName(customers.getLastName());
        notafiscalVO.setProdId(orderlines.getProdId());
        notafiscalVO.setQuantity(orderlines.getQuantity());
        notafiscalVO.setTitle(products.getTitle());
        notafiscalVO.setNetAmount(orders.getNetAmount());
        notafiscalVO.setTotalAmount(orders.getTotalAmount());
        notafiscalVO.setOrderDate(orders.getOrderDate());
        notafiscalVO.setOrderId(orders.getOrderId());

        return notafiscalVO;
    }
    

}
