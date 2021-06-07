package com.residencia.dell.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "orderlines")
public class Orderlines {
    
    @Id
    @Column(name = "orderlineid")
    private Integer orderLineId;

    // //Fk orders / Talvez problema com o objeto orders
    
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "orderid", referencedColumnName = "orderid")
    private Orders orderId;

    @Column(name = "prod_id")
    private Integer prodId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "orderdate")
    private Calendar orderDate;


    public Integer getOrderLineId() {
        return this.orderLineId;
    }

    public void setOrderLineId(Integer orderLineId) {
        this.orderLineId = orderLineId;
    }


    public Orders getOrders() {
        return this.orderId;
    }

    public void setOrders(Orders orders) {
        this.orderId = orders;
    }

    public Integer getProdId() {
        return this.prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Calendar getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
    }
    


}
