/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.controller;


import com.renova.bootcamp.generalclasses.UserInfoMessages;
import com.renova.bootcamp.view.customer.CompanyForm;

/**
 *
 * @author Lokman UGUR
 */
public class CustomerController {

    private final CompanyForm customerForm;
    
    public CustomerController(CompanyForm customerForm) {
        this.customerForm=customerForm;
    }

}
