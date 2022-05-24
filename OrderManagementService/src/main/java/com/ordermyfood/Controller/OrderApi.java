package com.ordermyfood.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ordermyfood.Controller.ModelRequest.OrderCancelRequest;
import com.ordermyfood.Controller.ModelRequest.OrderCancelResponse;
import com.ordermyfood.Controller.ModelRequest.OrderRequest;
import com.ordermyfood.Controller.ModelRequest.OrderResponse;
import com.ordermyfood.Entity.Order;
import com.ordermyfood.Exception.OrderException;
import com.ordermyfood.ServiceImpl.OrderServiceImpl;

@RestController
@RequestMapping("/order/api")
public class OrderApi {
	@Autowired
private OrderServiceImpl orderServiceImpl;
	@PostMapping("/createOrder/{restaurantId}")
public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest,@PathVariable String restaurantId) {
	return new ResponseEntity<OrderResponse>(orderServiceImpl.createOrder(orderRequest),HttpStatus.CREATED);	
}
	@PostMapping("/updateOrder")
public ResponseEntity<OrderResponse> updateOrder(@RequestBody OrderRequest orderRequest) throws OrderException
{
	 return new ResponseEntity<OrderResponse>(orderServiceImpl.updateOrder(orderRequest),HttpStatus.OK);
}
	@PostMapping("/cancelOrder")
public ResponseEntity<OrderCancelResponse> cancelOrder(@RequestBody OrderCancelRequest orderCancelRequest) throws OrderException
{
	return new ResponseEntity<OrderCancelResponse>(orderServiceImpl.cancelOrder(orderCancelRequest),HttpStatus.OK);
}
@GetMapping("/viewOrders/{customerName}")
public List<Order> viewOrders(@PathVariable String customerName) throws OrderException
{
	return orderServiceImpl.viewOrders(customerName);
}
}

