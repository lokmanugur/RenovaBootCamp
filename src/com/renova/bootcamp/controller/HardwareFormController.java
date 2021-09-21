/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.controller;

import com.renova.bootcamp.dao.Dao;
import com.renova.bootcamp.dao.ProductDaoImpl;
import com.renova.bootcamp.models.product.Hardware;
import com.renova.bootcamp.models.product.Product;
import com.renova.bootcamp.view.product.HardwareForm;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 */
public class HardwareFormController {

    private final HardwareForm hardwareForm;
    private final Dao<Product> productDao;  
    public HardwareFormController(HardwareForm hardwareForm) {
        this.hardwareForm = hardwareForm;
        productDao = ProductDaoImpl.getInstance();
    }
    
    public void addProduct(){
        productDao.save((Product)new Hardware(
                Integer.valueOf(hardwareForm.getIdTextField().getText()), 
                   hardwareForm.getNameTextField().getText(), 
                Double.valueOf(hardwareForm.getPriceTextField().getText()),
                hardwareForm.getDescriptionTextArea().getText(),
                Integer.valueOf(hardwareForm.getWarrantyTextField().getText())));
    }
    
}
