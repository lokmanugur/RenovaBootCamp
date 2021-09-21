/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renova.bootcamp.dao;

import com.renova.bootcamp.models.product.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 */
public class ProductDaoImpl implements Dao<Product> {

    List<Product> productList;
    private static ProductDaoImpl productDaoImpl;
    
    private ProductDaoImpl(){
        productList=getProductList();
    }

    public static ProductDaoImpl getInstance(){
        if(productDaoImpl==null)
            return productDaoImpl= new ProductDaoImpl();
        else
            return productDaoImpl;
    }

    @Override
    public Product get(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void save(Product t) {
        productList.add(t);
    }

    @Override
    public void update(Product t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Product t) {
        if (!getProductList().isEmpty()) {
            productList.remove(t);
        }
    }

    private List<Product> getProductList() {
        if (productListIsNull()) {
            createProductList();
        }
        return productList;
    }

    private boolean productListIsNull() {
        return productList == null;
    }

    private void createProductList() {
        productList = new ArrayList<>();
    }
}
