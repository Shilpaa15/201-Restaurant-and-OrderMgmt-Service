package com.ordermyfood.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Restaurant {
@Id
	private String id;
	private String restaurantId;
    private String restaurantName;
    private String restaurantlocation;
    private String cuisine;
    private int distance;
    private int budget;
   
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String id, String restaurantId, String restaurantName, String restaurantlocation, String cuisine,
			int distance, int budget) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantlocation = restaurantlocation;
		this.cuisine = cuisine;
		this.distance = distance;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
				+ ", restaurantlocation=" + restaurantlocation + ", cuisine=" + cuisine + ", distance=" + distance
				+ ", budget=" + budget + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantlocation() {
		return restaurantlocation;
	}
	public void setRestaurantlocation(String restaurantlocation) {
		this.restaurantlocation = restaurantlocation;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
}