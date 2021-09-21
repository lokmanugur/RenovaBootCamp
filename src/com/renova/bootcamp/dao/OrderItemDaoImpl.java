/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.dao;

import com.renova.bootcamp.models.product.OrderItem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 */
public class OrderItemDaoImpl implements Dao<OrderItem> {

    List<OrderItem> orderItemsList;
    private static OrderItemDaoImpl orderItemDaoImpl;

    private OrderItemDaoImpl() {
        this.orderItemsList = getOrderItemsList();
    }

    public static OrderItemDaoImpl getInstance() {
        if (orderItemDaoImpl == null) {
            return orderItemDaoImpl = new OrderItemDaoImpl();
        } else {
            return orderItemDaoImpl;
        }
    }

    @Override
    public OrderItem get(int id) {
        for (OrderItem oi : orderItemsList) {
            if (oi.getLineNumber() == id) {
                return oi;
            }
        }
        return null;
    }

    @Override
    public List<OrderItem> getAll() {
        return orderItemsList;
    }

    @Override
    public void save(OrderItem t) {
        orderItemsList.add(t);
    }

    @Override
    public void update(OrderItem t) {

    }

    @Override
    public void delete(OrderItem t) {
        if (!getOrderItemsList().isEmpty()) {
            orderItemsList.remove(t);
        }
    }

    private List<OrderItem> getOrderItemsList() {
        if (orderItemsListIsNull()) {
            createOrderItemsList();
        }
        return orderItemsList;
    }

    private boolean orderItemsListIsNull() {
        return orderItemsList == null;
    }

    private void createOrderItemsList() {
        orderItemsList = new ArrayList<>();
    }

}
