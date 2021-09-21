/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.controller;
import com.renova.bootcamp.dao.Dao;
import com.renova.bootcamp.dao.ProductDaoImpl;
import com.renova.bootcamp.generalclasses.UserInfoMessages;
import com.renova.bootcamp.models.customer.Company;
import com.renova.bootcamp.models.customer.Customer;
import com.renova.bootcamp.models.customer.Individual;
import com.renova.bootcamp.models.product.Hardware;
import com.renova.bootcamp.models.product.Manual;
import com.renova.bootcamp.models.product.Product;
import com.renova.bootcamp.models.product.Software;
import com.renova.bootcamp.view.product.ManualForm;
import com.renova.bootcamp.view.product.ProductSearchForm;
import java.util.List;

/**
 *
 * @author ugur
 * 
 */
public final class ProductSearchFormController {

    private final ProductSearchForm productSearchForm;
    private final Dao<Product> productDao;
    private int counter = 0;
    

    public ProductSearchFormController(ProductSearchForm productSearchForm) {
        this.productSearchForm = productSearchForm;
        productDao = ProductDaoImpl.getInstance();
    }
    
        public void fillProductTable() {
//      fillCustomerTable(tableHeader, customerAllData, customerSearchForm.getDefaultTableModel());
        
        List<Product> customerAllData = productDao.getAll();
        Object[] idObject = new Object[customerAllData.size()];
        Object[] nameObject = new Object[customerAllData.size()];
        Object[] retailPriceObject = new Object[customerAllData.size()];
        Object[] descriptionObject = new Object[customerAllData.size()];
        Object[] warrantyObject = new Object[customerAllData.size()];
        Object[] taxObject = new Object[customerAllData.size()];
        Object[] licenceObject = new Object[customerAllData.size()];
        Object[] publisherObject = new Object[customerAllData.size()];

        customerAllData.forEach((Product value) -> {
            idObject[counter] = value.getId();
            nameObject[counter] = value.getName();
            retailPriceObject[counter] = value.getRetailPrice();
            descriptionObject[counter] = value.getDescription();
            if(value instanceof Hardware){
                warrantyObject[counter] = ((Hardware)value).getWarrantyPeriod();
                taxObject[counter] = ((Hardware)value).getTax();
            }else if(value instanceof Software){
                licenceObject[counter] = ((Software)value).getLicence();
            }else if(value instanceof Manual){
                publisherObject[counter] = ((Manual)value).getPublisher();
            }
            counter++;
        });
        productSearchForm.getDefaluDefaultTableModel().addColumn("Id", idObject);
        productSearchForm.getDefaluDefaultTableModel().addColumn("Name", nameObject);
        productSearchForm.getDefaluDefaultTableModel().addColumn("Retail Price", retailPriceObject);
        productSearchForm.getDefaluDefaultTableModel().addColumn("Description", descriptionObject);
        productSearchForm.getDefaluDefaultTableModel().addColumn("Warranty", warrantyObject);
        productSearchForm.getDefaluDefaultTableModel().addColumn("Taxable", taxObject);
        productSearchForm.getDefaluDefaultTableModel().addColumn("Licence", licenceObject);
        productSearchForm.getDefaluDefaultTableModel().addColumn("Publisher", publisherObject);
        counter = 0;
    }

}
