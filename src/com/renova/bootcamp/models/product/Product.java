
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
	private String description;
	private int id;
	private String name;
	private double retailPrice;

	public Product(String description, int id, String name, double retailPrice) {
		this.description = description;
		this.id = id;
		this.name = name;
		this.retailPrice = retailPrice;
	}
	
	public Product() {
		
	}

	/**
	 * @param description the description to set
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

	public double getRetailPrice() {
		return retailPrice;
	}

	@Override
	public String toString() {
		return "Product [description=" + description + ", id=" + id + ", name=" + name + ", retailPrice=" + retailPrice
				+ "]";
	}
	
}
