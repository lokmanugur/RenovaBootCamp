/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp;


import com.renova.bootcamp.models.customer.Company;
import com.renova.bootcamp.models.customer.Customer;
import com.renova.bootcamp.models.product.Hardware;
import com.renova.bootcamp.models.customer.Individual;
import com.renova.bootcamp.models.product.Manuel;
import com.renova.bootcamp.models.Order;
import com.renova.bootcamp.models.product.OrderItem;
import com.renova.bootcamp.models.product.Product;
import com.renova.bootcamp.models.product.Software;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 */
public class ComRenovaBootcamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Product product1 = new Hardware("hardware description", 101, "Hardware", 10.0, 20);
        Product product2 = new Manuel("Manuel Description", 102, "manuel", 10.0, "publisher");
        Product product3 = new Software("Software Description", 103, "Software", 10.0, "AR12FRE3S");

        OrderItem orderItem1 = new OrderItem(201, product1, 3);
        OrderItem orderItem2 = new OrderItem(202, product2, 4);
        OrderItem orderItem3 = new OrderItem(203, product3, 2);

        Customer customer1 = new Company("Company address", 301, "ABC comp", "5053122323", "firstNane Lastname", 5);
        Customer customer2 = new Individual("Individual address", 302, "I-FirstName LastName", "5330546878", "951753");
        
        List<OrderItem> orderItemList1 = new ArrayList<>();
        List<OrderItem> orderItemList2 = new ArrayList<>();
        orderItemList1.add(orderItem1);
        orderItemList1.add(orderItem2);
        orderItemList1.add(orderItem3);

        orderItemList2.add(orderItem2);
        orderItemList2.add(orderItem3);
        
        Order order1 = new Order(customer1, 501, orderItemList1, LocalDate.of(2021, 10, 18));
        Order order2 = new Order(customer2, 502, orderItemList2, LocalDate.of(2021, 10, 19));

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
