package com.residencia.dell.vo;

import java.util.Calendar;

public class ItemOrderLinesVO {
    private Integer OrderLineId;
    private Integer orderId;
	private Integer prodId;
	private Integer quantity;
	private Calendar orderDate;
    private String title;


    public Integer getOrderLineId() {
        return this.OrderLineId;
    }

    public void setOrderLineId(Integer OrderLineId) {
        this.OrderLineId = OrderLineId;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
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
