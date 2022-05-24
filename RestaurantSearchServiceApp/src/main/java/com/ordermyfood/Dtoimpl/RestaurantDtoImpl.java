package com.ordermyfood.Dtoimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ordermyfood.Dto.RestaurantDto;
import com.ordermyfood.entity.Restaurant;
import com.ordermyfood.repository.RestaurantRepository;
@Component
public class RestaurantDtoImpl implements RestaurantDto {
@Autowired
private RestaurantRepository restaurantRepository;
	@Override
	public Restaurant createRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantRepository.save(restaurant);
	}

	@Override
	public List<Restaurant> getRestaurantByName(String name) {
		// TODO Auto-generated method stub
		return (List<Restaurant>) restaurantRepository.findByName(name);
	}

	@Override
	public List<Restaurant> getRestaurantByLocation(String location) {
		// TODO Auto-generated method stub
		return (List<Restaurant>) restaurantRepository.findByLocation(location);
	}

	@Override
	public List<Restaurant> getRestaurantByDistance(int distance) {
		// TODO Auto-generated method stub
		return restaurantRepository.findByDistance(distance);
	}

	@Override
	public List<Restaurant> getRestaurantByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return (List<Restaurant>) restaurantRepository.findByCuisine(cuisine);
	}
	@Override
	public List<Restaurant> getRestaurantByBudget(int budget) {
		// TODO Auto-generated method stub
		return restaurantRepository.findByBudget(budget);
	}
	@Override
	public void deleteRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		 restaurantRepository.delete(restaurant);
	}
}
