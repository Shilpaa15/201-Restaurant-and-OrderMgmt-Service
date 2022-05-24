package com.ordermyfood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.ordermyfood.entity.Restaurant;
	public interface RestaurantRepository extends JpaRepository<Restaurant,String> {
	@Query("select r from Restaurant r where r.restaurantName=?1")
	  public List<Restaurant> findByName(@Param("restaurantName") String restaurantName);
	@Query("select r from Restaurant r where r.restaurantlocation=?1")
	   public List<Restaurant> findByLocation(@Param("restaurantlocation") String restaurantlocation);
		@Query("select r from Restaurant r where r.distance=?1")
	 public List<Restaurant> findByDistance(@Param("distance") int distance);
		@Query("select r from Restaurant r where r.cuisine=?1")
	  public List<Restaurant> findByCuisine(@Param("cuisine") String cuisine);
		@Query("select r from Restaurant r where r.budget=?1")
	   public List<Restaurant> findByBudget(@Param("budget") int budget);

	}
