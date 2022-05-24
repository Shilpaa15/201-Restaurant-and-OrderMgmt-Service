package com.ordermyfood.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class MenuItem {
@Id
  private String id;
	private String restaurantId;
	private String restaurantName;
    private String itemName;
    private String itemDescription;
    private double itemPrice;
    
	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuItem(String id, String restaurantId, String itemName, String itemDescription, double itemPrice) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", restaurantId=" + restaurantId + ", itemName=" + itemName + ", itemDescription="
				+ itemDescription + ", itemPrice=" + itemPrice + "]";
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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
}