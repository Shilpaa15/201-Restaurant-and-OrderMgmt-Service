package com.ordermyfood.Dtoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ordermyfood.Dto.MenuItemDto;
import com.ordermyfood.entity.MenuItem;
import com.ordermyfood.repository.MenuItemRepository;
@Component
public class MenuItemDtoImpl implements MenuItemDto {
@Autowired
MenuItemRepository menuItemRepository;
	@Override
	public MenuItem createMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		return menuItemRepository.save(menuItem);
	}

	@Override
	public List<MenuItem> findByName(String restaurantName) {
		// TODO Auto-generated method stub
		return menuItemRepository.findByRestaurantName(restaurantName);
	}


	@Override
	public List<MenuItem> findAllMenusByRestaurantId(String restaurantId) {
		// TODO Auto-generated method stub
		return menuItemRepository.findMenuByRestaurantId(restaurantId);
	}
}
