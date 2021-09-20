
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

public class Turkey extends AbstractTaxCalculator implements CalculateTaxStrategy{

    private static double TAX = 18; 
    
    @Override
    public double calculateTax(double price) {
        return calculateTax(price, TAX);
    }
    
}
