/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.controller;

import com.renova.bootcamp.dao.CustomerDaoImpl;
import com.renova.bootcamp.dao.Dao;
import com.renova.bootcamp.dao.OrderDaoImpl;
import com.renova.bootcamp.dao.OrderItemDaoImpl;
import com.renova.bootcamp.models.Order;
import com.renova.bootcamp.models.customer.Customer;
import com.renova.bootcamp.models.product.OrderItem;
import com.renova.bootcamp.view.order.OrderForm;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ugur
 */
public class OrderFormController {

    private final OrderForm orderForm;
    private final Dao<OrderItem> orderItemList;
    private final Dao<Customer> customerDaoList;
    private final Dao<Order> orderDaoList;
    private List<Customer> customerList;
    private final List<OrderItem> customerAllData;
    private final List<Order> orderList;

    private int counter = 0;

    public OrderFormController(OrderForm orderForm) {
        this.orderForm = orderForm;
        orderItemList = OrderItemDaoImpl.getInstance();
        customerDaoList = CustomerDaoImpl.getInstance();
        customerAllData = orderItemList.getAll();
        orderDaoList = OrderDaoImpl.getInstance();
        orderList = new ArrayList<>();
    }

    public void fillOrderItemTable() {
        Object[] lineNumberObject = new Object[customerAllData.size()];
        Object[] productNameObject = new Object[customerAllData.size()];
        Object[] unitPriceObject = new Object[customerAllData.size()];
        Object[] taxObject = new Object[customerAllData.size()];
        Object[] quantityObject = new Object[customerAllData.size()];

        customerAllData.forEach((OrderItem value) -> {
            lineNumberObject[counter] = value.getLineNumber();
            productNameObject[counter] = value.getProduct().getName();
            unitPriceObject[counter] = value.getUnitPrice();
            taxObject[counter] = value.getTax();
            quantityObject[counter] = value.getQuantity();
            counter++;
        });
        orderForm.getDefaultTableModel().addColumn("Line Number", lineNumberObject);
        orderForm.getDefaultTableModel().addColumn("Product Name", productNameObject);
        orderForm.getDefaultTableModel().addColumn("Unit Price", unitPriceObject);
        orderForm.getDefaultTableModel().addColumn("Tax", taxObject);
        orderForm.getDefaultTableModel().addColumn("Quantity", quantityObject);
        counter = 0;
    }

    public void fillOrderTable() {
        Object[] idObject = new Object[orderList.size()];
        Object[] customerObject = new Object[orderList.size()];
        Object[] itemsObject = new Object[orderList.size()];
        Object[] dateObject = new Object[orderList.size()];
        Object[] orderTotalObject = new Object[orderList.size()];

        orderList.forEach((Order value) -> {
            idObject[counter] = value.getId();
            customerObject[counter] = value.getCustomer();
            itemsObject[counter] = value.getItems();
            dateObject[counter] = value.getOrderDate();
            orderTotalObject[counter] = value.getOrderTotal();
            counter++;
        });
        orderForm.getDefaultTableModelIOrder().addColumn("Id", idObject);
        orderForm.getDefaultTableModelIOrder().addColumn("Customer", customerObject);
        orderForm.getDefaultTableModelIOrder().addColumn("Items", itemsObject);
        orderForm.getDefaultTableModelIOrder().addColumn("Date", dateObject);
        orderForm.getDefaultTableModelIOrder().addColumn("Order Total", orderTotalObject);
        counter = 0;
    }

    public void addAllCustomerToComboBox() {
        customerList = customerDaoList.getAll();
        orderForm.getCustomerComboBox().removeAllItems();
        customerList.forEach((Customer value) -> {
            orderForm.getCustomerComboBox().addItem(value.getId()+" "+value.getName());
        });
    }

//    public void addCartButton() {
//        Order order = new Order();
//        order.setId(Integer.valueOf(orderForm.getOrderIdTextField().getText()));
//        order.setCustomer(compare((String)orderForm.getCustomerComboBox().getSelectedItem()));
//        order.setItems(customerAllData);
//        order.setOrderDate(new Date(orderForm.getDateChooser().getDate().getTime()));
//        System.out.println(order.getCustomer().getName());
//    }
//    
//    private Customer compare(String str){
//        for(Customer c : customerList){
//        if(c.equals((Object)str))
//            return c;
//        }
//        return null;
//    }
}
