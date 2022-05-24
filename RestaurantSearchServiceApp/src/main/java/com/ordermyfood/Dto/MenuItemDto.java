package com.ordermyfood.Dto;

import java.util.List;

import com.ordermyfood.entity.MenuItem;

public interface MenuItemDto {
	 public MenuItem createMenuItem(MenuItem menuItem);
	 public List<MenuItem> findByName(String restaurantName);
	  List<MenuItem> findAllMenusByRestaurantId(String restaurantId);
}
