
/*
 * Copyright (c) 2021, All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.
 */
package com.renova.bootcamp.models.product;

/**
 *
 * @author Lokman ugur lokman.ugur@hotmail.com
 *
 */

public abstract class Product {


    private int id;
    private String name;
    private double retailPrice;
    private String description;

    public Product(int id, String name, double retailPrice,String description) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.retailPrice = retailPrice;
    }

    public Product() {

    }

    /**
     * @return
     */
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getRetailPrice(){
        return retailPrice;
    }

    @Override
    public String toString() {
        return "Product [description=" + description + ", id=" + id + ", name=" + name + ", retailPrice=" + retailPrice
                + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    

}
