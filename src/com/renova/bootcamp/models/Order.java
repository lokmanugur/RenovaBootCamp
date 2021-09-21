
/*
 * Copyright (c) 2021, All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.
 */
package com.renova.bootcamp.models;

/**
 *
 * @author Lokman ugur lokman.ugur@hotmail.com
 *
 */
import com.renova.bootcamp.models.product.OrderItem;
import com.renova.bootcamp.models.customer.Customer;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Order {

    private int id;
    private Customer customer;
    private List<OrderItem> items;
    private Date orderDate;
    private double orderTotal;

    public Order(int id, Customer customer, List<OrderItem> items, Date orderDate) {
        this.customer = customer;
        this.id = id;
        this.items = items;
        this.orderDate = orderDate;
    }

    public Order() {
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the items
     */
    public List<OrderItem> getItems() {
        return items;
    }

    /**
     * @return the orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * this method calculate summation of all orderitem which added ArrayList
     * also multiply per unitPrice with its quantity and add orderTotal
     *
     * @return the orderTotal
     */
    public double getOrderTotal() {
        orderTotal = 0;
        items.forEach(orderItem -> {
            orderTotal += orderItem.getUnitPrice() * orderItem.getQuantity();
        });
        return orderTotal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    
    
    @Override
    public int hashCode() {
        return id; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        return this.id == other.id;
    }

    
}
