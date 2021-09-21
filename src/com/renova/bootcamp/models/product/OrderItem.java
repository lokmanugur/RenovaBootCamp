
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
public class OrderItem {

    private final int lineNumber;
    private final Product product;
    private final int quantity;

    /**
     *
     * @param lineNumber
     * @param product
     * @param quantity
     */
    public OrderItem(int lineNumber, Product product, int quantity) {
        super();
        this.lineNumber = lineNumber;
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * @return the lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * This method get retailPrice calculate its tax than add tax to unite price
     * with retail price
     *
     * @return the double value; tax + retailPrice for per unit
     */
    public double getUnitPrice() {
        return getTax() + product.getRetailPrice();
    }

    /**
     * This method use retailPrice to calculate tax price for
     *
     * @return the double value as a tax of retailPrice;
     */
    public double getTax() {
        if (product instanceof Hardware) {
            return ((Hardware) product).getTax();
        } else {
            return 0;
        }
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
        final OrderItem other = (OrderItem) obj;
        if (this.lineNumber != other.lineNumber) {
            return false;
        }
        return true;
    }
    
    

}
