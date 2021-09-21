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

import com.renova.bootcamp.tax.Turkey;

/**
 *
 * @author Lokman ugur lokman.ugur@hotmail.com
 *
 */
public class Hardware extends Product {

    private final int warrantyPeriod;

    public Hardware( int id, String name, double retailPrice, String description, int warrantyPeriod) {
        super( id, name, retailPrice,description);
        this.warrantyPeriod = warrantyPeriod;
    }
    /**
     * @return the warrantyPeriod
     */
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public double getTax(){
        return new Turkey().calculateTax(getRetailPrice());
    }
}
