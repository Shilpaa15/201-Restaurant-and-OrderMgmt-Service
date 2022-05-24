package com.ordermyfood.Dto;

import java.util.List;

import com.ordermyfood.entity.Restaurant;

public interface RestaurantDto {
	public Restaurant createRestaurant(Restaurant restaurant);
	public List<Restaurant> getRestaurantByName(String name);
	public List<Restaurant> getRestaurantByLocation(String location);
	public List<Restaurant> getRestaurantByDistance(int distance);
	public List<Restaurant> getRestaurantByCuisine(String cuisine);
	public List<Restaurant> getRestaurantByBudget(int budget);
	public void deleteRestaurant(Restaurant restaurant);	
}
