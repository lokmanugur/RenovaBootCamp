/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp;


import com.renova.bootcamp.dao.CustomerDaoImpl;
import com.renova.bootcamp.dao.Dao;
import com.renova.bootcamp.dao.OrderItemDaoImpl;
import com.renova.bootcamp.dao.ProductDaoImpl;
import com.renova.bootcamp.models.customer.Company;
import com.renova.bootcamp.models.customer.Customer;
import com.renova.bootcamp.models.product.Hardware;
import com.renova.bootcamp.models.customer.Individual;
import com.renova.bootcamp.models.product.Manual;
import com.renova.bootcamp.models.Order;
import com.renova.bootcamp.models.product.OrderItem;
import com.renova.bootcamp.models.product.Product;
import com.renova.bootcamp.models.product.Software;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 */
public class RenovaBootCampTest {

    /**
     * @param args the command line arguments
     */
    public static void test() {

        Product product1 = new Hardware( 101, "Hardware", 10.0,"hardware description", 20);
        Product product2 = new Manual( 102, "manuel", 10.0,"Manuel Description", "publisher");
        Product product3 = new Software( 103, "Software", 10.0,"Software Description", "AR12FRE3S");
        Dao<Product> productDao = ProductDaoImpl.getInstance();
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        
        OrderItem orderItem1 = new OrderItem(201, product1, 3);
        OrderItem orderItem2 = new OrderItem(202, product2, 4);
        OrderItem orderItem3 = new OrderItem(203, product3, 2);
        Dao<OrderItem> orderItemDao = OrderItemDaoImpl.getInstance();
        orderItemDao.save(orderItem1);
        orderItemDao.save(orderItem2);
        orderItemDao.save(orderItem3);

        Customer customer1 = new Company( 301, "ABC comp", "5053122323","Company address", "firstNane Lastname", 5);
        Customer customer2 = new Individual( 302, "I-FirstName LastName", "5330546878","Individual address", "951753");
        Dao<Customer> customer = CustomerDaoImpl.getInstance();
        customer.save(customer1);
        customer.save(customer2);
        
        
        List<OrderItem> orderItemList1 = new ArrayList<>();
        List<OrderItem> orderItemList2 = new ArrayList<>();
        
        orderItemList1.add(orderItem1);
        orderItemList1.add(orderItem2);
        orderItemList1.add(orderItem3);

        orderItemList2.add(orderItem2);
        orderItemList2.add(orderItem3);
        
        Order order1 = new Order( 501,customer1, orderItemList1,new Date(2021, 10, 18));
        Order order2 = new Order( 502,customer2, orderItemList2, new Date(2021, 10, 19));

        orderItemList1.forEach(oi -> {
            System.out.println(order1.getCustomer().getId() + "  " + order1.getCustomer().getName() + "      "
                    + oi.getProduct() + "    " + order1.getOrderDate() + "    " + order1.getOrderTotal());
        });

        System.out.println("-----------------------------------------");

        orderItemList2.forEach(oi -> {
            System.out.println(order2.getCustomer().getId() + "  " + order2.getCustomer().getName() + "     "
                    + oi.getProduct() + "    " + order2.getOrderDate() + "    " + order2.getOrderTotal());
        });
    }

}
