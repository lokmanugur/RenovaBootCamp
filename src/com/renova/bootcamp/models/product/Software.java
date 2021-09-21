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
public class Software extends Product {

    private final String licence;

    public Software( int id, String name, double retailPrice,String description, String licence) {
        super( id, name, retailPrice,description);
        this.licence = licence;
    }

    /**
     * @return the license
     */
    public String getLicence() {
        return licence;
    }

}
