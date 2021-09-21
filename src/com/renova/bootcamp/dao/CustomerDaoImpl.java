/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.dao;

import com.renova.bootcamp.models.customer.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 */
public class CustomerDaoImpl implements Dao<Customer> {

    private List<Customer> customerList;
    private static CustomerDaoImpl customerDaoImpl;

    private  CustomerDaoImpl() {
        this.customerList = getCustomerList();
    }
    
    public static CustomerDaoImpl getInstance(){
        if(customerDaoImpl==null)
            customerDaoImpl = new CustomerDaoImpl();
        return customerDaoImpl;
    }
    
    @Override
    public Customer get(int id) {
        for (Customer c : getCustomerList()) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }

    @Override
    public void save(Customer t) {
        customerList.add(t);
    }

    @Override
    public void update(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Customer t) {
        if(!getCustomerList().isEmpty())
        customerList.remove(t);
    }

    private List<Customer> getCustomerList() {
        if (customerListIsNull()) {
            createCustomerList();
        }
        return customerList;
    }

    private void createCustomerList() {
        customerList = new ArrayList<>();
    }

    private boolean customerListIsNull() {
        return customerList == null;
    }
}
