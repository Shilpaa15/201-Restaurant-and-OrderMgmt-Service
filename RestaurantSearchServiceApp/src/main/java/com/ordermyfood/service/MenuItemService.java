package com.ordermyfood.service;

import java.util.List;

import com.ordermyfood.entity.MenuItem;


public interface MenuItemService {
    public MenuItem createMenuItem(MenuItem menuItem);
    public List<MenuItem> showFoodMenuByName(String name);
    List<MenuItem> showFoodMenuById(String restaurantId);
}
