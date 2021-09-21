/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.controller;

import com.renova.bootcamp.dao.CustomerDaoImpl;
import com.renova.bootcamp.dao.Dao;
import com.renova.bootcamp.models.customer.Customer;
import com.renova.bootcamp.models.customer.Individual;
import com.renova.bootcamp.view.customer.IndividualForm;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 */
public class IndividualFormController {

    private final IndividualForm individualForm;
    private final Dao<Customer> customerDao;
    public IndividualFormController(IndividualForm aThis) {
        this.individualForm = aThis;
        this.customerDao = CustomerDaoImpl.getInstance();
        
    }

    public void addIndividual() {
        customerDao.save((Customer)new Individual(Integer.valueOf(individualForm.getIdTextField().getText()),
                individualForm.getNameTextField().getText(), 
                individualForm.getPhoneTextField().getText(),
                individualForm.getAddressTextArea().getText(), 
                individualForm.getLicenceTextField().getText()));
    }
    
}
