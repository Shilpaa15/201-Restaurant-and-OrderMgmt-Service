package com.ordermyfood.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordermyfood.Dto.RestaurantDto;
import com.ordermyfood.entity.Restaurant;
import com.ordermyfood.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {
@Autowired
	private RestaurantDto restaurantDto;

@Override
public Restaurant createRestaurant(Restaurant restaurant) {
	// TODO Auto-generated method stub
	return restaurantDto.createRestaurant(restaurant);
}

@Override
public List<Restaurant> getRestaurantByName(String name) {
	// TODO Auto-generated method stub
	return restaurantDto.getRestaurantByName(name);
}

@Override
public List<Restaurant> getRestaurantByLocation(String location) {
	// TODO Auto-generated method stub
	return restaurantDto.getRestaurantByLocation(location);
}

@Override
public List<Restaurant> getRestaurantByDistance(int distance) {
	// TODO Auto-generated method stub
	return restaurantDto.getRestaurantByDistance(distance);
}

@Override
public List<Restaurant> getRestaurantByCuisine(String cuisine) {
	// TODO Auto-generated method stub
	return restaurantDto.getRestaurantByCuisine(cuisine);
}

@Override
public List<Restaurant> getRestaurantByBudget(int budget) {
	// TODO Auto-generated method stub
	return restaurantDto.getRestaurantByBudget(budget);
}

@Override
public void deleteRestaurant(Restaurant restaurant) {
	// TODO Auto-generated method stub
	 restaurantDto.deleteRestaurant(restaurant);

}


	
}
