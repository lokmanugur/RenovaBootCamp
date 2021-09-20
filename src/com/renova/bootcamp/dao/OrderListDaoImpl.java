
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

package com.renova.bootcamp.dao;

import com.renova.bootcamp.models.Order;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 * 
 * 
 */

public class OrderListDaoImpl implements OrderListDao<Order> {

	private List<Order> orderList;
		
	@Override
	public Order get(int id) {
		for(Order o : getOrderList()) {
			if(o.getId()==id) {
				return o;
			}
		}
		return null;
	}

	@Override
	public List<Order> getAll() {
		return getOrderList();
	}

	@Override
	public void save(Order t) {
		getOrderList().add(t);
	}

	@Override
	public void update(Order t) {
		getOrderList().equals(t);
	}

	@Override
	public void delete(Order t) {
		if(getOrderList().size()!=0) {
			getOrderList().remove(t);
		}
	}
	
	private List<Order> getOrderList() {
		if(orderListIsNull()) {
			createOrderList();
		}
		return orderList;
	}
	
	private void createOrderList() {
		orderList = new ArrayList<Order>();
	}
	
	private boolean orderListIsNull() {
		return orderList == null;
	}

}
