/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.controller;

import com.renova.bootcamp.dao.CustomerDaoImpl;
import com.renova.bootcamp.dao.Dao;
import com.renova.bootcamp.generalclasses.UserInfoMessages;
import com.renova.bootcamp.models.customer.Company;
import com.renova.bootcamp.models.customer.Customer;
import com.renova.bootcamp.models.customer.Individual;
import com.renova.bootcamp.view.customer.CustomerSearchForm;
import java.util.List;

/**
 *
 * @author ugur
 */
public final class CustomerSearchFormController {

    private final CustomerSearchForm customerSearchForm;
    private final Dao<Customer> customerDao;
    private int counter = 0;
    public CustomerSearchFormController(CustomerSearchForm customerSearchForm) {
        this.customerDao = CustomerDaoImpl.getInstance();
        this.customerSearchForm = customerSearchForm;
    }

    public void fillCustomerTable() {        
        List<Customer> customerAllData = customerDao.getAll();
        Object[] idObject = new Object[customerAllData.size()];
        Object[] nameObject = new Object[customerAllData.size()];
        Object[] addressObject = new Object[customerAllData.size()];
        Object[] phoneObject = new Object[customerAllData.size()];
        Object[] contactObject = new Object[customerAllData.size()];
        Object[] licenseObject = new Object[customerAllData.size()];

        customerAllData.forEach((Customer value) -> {
            idObject[counter] = value.getId();
            nameObject[counter] = value.getName();
            addressObject[counter] = value.getAddress();
            phoneObject[counter] = value.getPhone();
            if(value instanceof Company)
                contactObject[counter] = ((Company)value).getContact();
            else
                licenseObject[counter] = ((Individual)value).getLicNumber();
            counter++;
        });
        customerSearchForm.getDefaultTableModel().addColumn("Id", idObject);
        customerSearchForm.getDefaultTableModel().addColumn("Name", nameObject);
        customerSearchForm.getDefaultTableModel().addColumn("Address", addressObject);
        customerSearchForm.getDefaultTableModel().addColumn("Phone", phoneObject);
        customerSearchForm.getDefaultTableModel().addColumn("Contact", contactObject);
        customerSearchForm.getDefaultTableModel().addColumn("License", licenseObject);
        counter = 0;
    }


}
