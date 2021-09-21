
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
package com.renova.bootcamp.models.customer;

import java.util.Objects;

/**
 *
 * @author Lokman ugur lokman.ugur@hotmail.com
 *
 */
public class Individual extends Customer {

    private String licNumber;

    public Individual(int id, String name, String phone, String address, String licNumber) {
        super(id, name, phone, address);
        this.licNumber = licNumber;
    }

    /**
     * @return the licNumber
     */
    public String getLicNumber() {
        return licNumber;
    }

    /**
     * @param licNumber the licNumber to set
     */
    public void setLicNumber(String licNumber) {
        this.licNumber = licNumber;
    }

    @Override
    public String toString() {
        return "Individual [licNumber=" + licNumber + "]";
    }
    
}
