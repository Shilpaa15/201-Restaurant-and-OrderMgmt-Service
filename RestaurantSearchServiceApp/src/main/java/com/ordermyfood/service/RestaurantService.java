package com.ordermyfood.service;

import java.util.List;

import com.ordermyfood.entity.Restaurant;

public interface RestaurantService {
	Restaurant createRestaurant(Restaurant restaurant);
	public List<Restaurant> getRestaurantByName(String name);
	public List<Restaurant> getRestaurantByLocation(String location);
	public List<Restaurant> getRestaurantByDistance(int distance);
	public List<Restaurant> getRestaurantByCuisine(String cuisine);
	public List<Restaurant> getRestaurantByBudget(int budget);
    void deleteRestaurant(Restaurant restaurant);
}
