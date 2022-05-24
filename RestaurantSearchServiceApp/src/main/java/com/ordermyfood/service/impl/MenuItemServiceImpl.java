package com.ordermyfood.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ordermyfood.Dto.MenuItemDto;
import com.ordermyfood.entity.MenuItem;
import com.ordermyfood.service.MenuItemService;
@Service
public class MenuItemServiceImpl implements MenuItemService{
    @Autowired
    public MenuItemDto menuItemDto;
    @Override
    public MenuItem createMenuItem(MenuItem menuItem) {
    	// TODO Auto-generated method stub
    	return menuItemDto.createMenuItem(menuItem);
    }
    @Override
    public List<MenuItem> showFoodMenuByName(String name) {
    	// TODO Auto-generated method stub
    	return menuItemDto.findByName(name);
    }
    @Override
    public List<MenuItem> showFoodMenuById(String restaurantId) {
    	// TODO Auto-generated method stub
    	return menuItemDto.findAllMenusByRestaurantId(restaurantId);
    }
	
}






