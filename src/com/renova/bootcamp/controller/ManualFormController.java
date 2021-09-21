/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.controller;

import com.renova.bootcamp.dao.Dao;
import com.renova.bootcamp.dao.ProductDaoImpl;
import com.renova.bootcamp.models.product.Manual;
import com.renova.bootcamp.models.product.Product;
import com.renova.bootcamp.view.product.ManualForm;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 */

public class ManualFormController {

    private final ManualForm manualForm;
    private final Dao<Product> productDao;
    public ManualFormController(ManualForm aThis) {
        this.manualForm = aThis;
        productDao = ProductDaoImpl.getInstance();
    }
    
    public void addManual(){
        productDao.save((Product)new Manual(Integer.valueOf(manualForm.getIdTextField().getText()),
                manualForm.getNameTextField().getText(), 
                Double.valueOf(manualForm.getPriceTextField().getText()),
                manualForm.getDescriptionTextArea().getText(), 
                manualForm.getPublisherTextField().getText()));
    }
    
}
