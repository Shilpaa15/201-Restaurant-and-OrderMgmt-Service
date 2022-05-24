package com.ordermyfood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ordermyfood.entity.MenuItem;
@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {
	    public List<MenuItem> findByRestaurantName(@Param("restaurantName") String restaurantName);
	    List<MenuItem> findMenuByRestaurantId(@Param("restaurantId") String restaurantId);
	}
	

