package com.ordermyfood.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ordermyfood.entity.MenuItem;
import com.ordermyfood.entity.Restaurant;
import com.ordermyfood.service.impl.MenuItemServiceImpl;
import com.ordermyfood.service.impl.RestaurantServiceImpl;

@RestController
public class RestaurantSearchServiceApi {
	@Autowired
	private RestaurantServiceImpl restaurantImpl;
	@Autowired
	private MenuItemServiceImpl menuItemImpl;
	@PostMapping("createRestaurant")
	public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant){
		return new ResponseEntity<Restaurant>(restaurantImpl.createRestaurant(restaurant), HttpStatus.CREATED);
	}
	
	@GetMapping("getRestaurantByName/{name}")
	public List<Restaurant> getRestaurantByName(@PathVariable String name) {
		return restaurantImpl.getRestaurantByName(name);
	}
	@GetMapping("getRestaurantsByLocation/{location}")
	public List<Restaurant>getRestaurantByLocation(@PathVariable String location) {
		return restaurantImpl.getRestaurantByLocation(location);
		
	}
	@GetMapping("getRestaurantsByDistance/{distance}")
	public List<Restaurant>getRestaurantByDistance(@PathVariable int distance) {

		return restaurantImpl.getRestaurantByDistance(distance);
	}
	@GetMapping("getRestaurantsByCuisine/{cuisine}")
	public List<Restaurant>getRestaurantBycuisine(@PathVariable String cuisine) {
		return restaurantImpl.getRestaurantByCuisine(cuisine);
		
	}
	@GetMapping("getRestaurantsByBudget/{budget}")
	public List<Restaurant>getRestaurantByBudget(@PathVariable int budget) {

		return restaurantImpl.getRestaurantByBudget(budget);
		
	}
	@PostMapping("createMenuItems")
	public ResponseEntity<MenuItem> createMenuItem(@RequestBody MenuItem menuItem) {
		menuItemImpl.createMenuItem(menuItem);
		return new ResponseEntity<MenuItem>(menuItemImpl.createMenuItem(menuItem),HttpStatus.CREATED);
	}
	@GetMapping("showFoodMenuById/{restaurantId}")
	public List<MenuItem>findAllMenusByRestaurantId(@PathVariable String restaurantId) {
		return menuItemImpl.showFoodMenuById(restaurantId);	
	}
	
	@GetMapping("showFoodMenuByName/{name}")
	public List<MenuItem>findByName(@PathVariable String name) {
		return menuItemImpl.showFoodMenuByName(name);
		
	}
	}

