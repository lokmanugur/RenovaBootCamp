/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.controller;

import com.renova.bootcamp.dao.Dao;
import com.renova.bootcamp.dao.ProductDaoImpl;
import com.renova.bootcamp.models.product.Product;
import com.renova.bootcamp.models.product.Software;
import com.renova.bootcamp.view.product.SoftwareForm;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 */
public class SoftwareFormController {

    private final SoftwareForm softwareForm;
    private final Dao<Product> softwareDao;
    public SoftwareFormController(SoftwareForm softwareForm) {
        this.softwareForm = softwareForm;
        softwareDao = ProductDaoImpl.getInstance();
    }
    
    public void addSoftware(){
        softwareDao.save((Product)new Software(Integer.valueOf(softwareForm.getIdTextField().getText()), 
                softwareForm.getNameTextField().getText(), 
                Double.valueOf(softwareForm.getPriceTextField().getText()),
                softwareForm.getDescriptionTextArea().getText() ,
                softwareForm.getLiscenseTextField().getText()));
    }
    
}
