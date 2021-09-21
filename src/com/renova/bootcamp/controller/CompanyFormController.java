/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.controller;

import com.renova.bootcamp.dao.CustomerDaoImpl;
import com.renova.bootcamp.dao.Dao;
import com.renova.bootcamp.models.customer.Company;
import com.renova.bootcamp.models.customer.Customer;
import com.renova.bootcamp.view.customer.CompanyForm;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 */
public class CompanyFormController {

    private final CompanyForm companyForm;
    private final Dao<Customer> customerDao;
    public CompanyFormController(CompanyForm aThis) {
        this.companyForm= aThis;
        customerDao = CustomerDaoImpl.getInstance();
    }

    public void addCompany() {
        customerDao.save((Customer)new Company(Integer.valueOf(companyForm.getIdTextField().getText()), 
                companyForm.getNameTextField().getText(), 
                companyForm.getPhoneTextField().getText(), 
                companyForm.getAddressTextArea().getText(), 
                companyForm.getContactTextField().getText(), 
                Integer.valueOf(companyForm.getDiscountTextField().getText())));
    }
    
}
