package com.ordermyfood.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ordermyfood.Entity.Order;

@Repository
public interface OrderServiceRepository extends JpaRepository<Order,String> {
	List<Order> findByCustomerName(String customerName);
	List<Order> findByCustomerNameAndItemDetailName(String customerName, String name);
	List<Order> findByRestaurantId(String restaurantId);
	Order getByOrderIdAndCustomerName(String orderId, String customerName);
}