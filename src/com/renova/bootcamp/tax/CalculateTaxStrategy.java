
package com.renova.bootcamp.tax;

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

/**
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 * 
 * 
 */

public interface CalculateTaxStrategy {
    
    double calculateTax(double price);
    
}
