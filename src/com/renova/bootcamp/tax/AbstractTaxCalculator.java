
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

package com.renova.bootcamp.tax;

/**
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 * 
 * 
 */

public abstract class AbstractTaxCalculator {

    /**
     * 
     * @return  double value
     */
    protected double calculateTax(double price,double tax){
        return price*(tax/100);
    }
}
