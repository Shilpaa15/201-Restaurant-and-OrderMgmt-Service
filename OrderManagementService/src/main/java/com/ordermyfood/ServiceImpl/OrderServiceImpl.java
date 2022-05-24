package com.ordermyfood.ServiceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordermyfood.Controller.ModelRequest.OrderCancelRequest;
import com.ordermyfood.Controller.ModelRequest.OrderCancelResponse;
import com.ordermyfood.Controller.ModelRequest.OrderRequest;
import com.ordermyfood.Controller.ModelRequest.OrderResponse;
import com.ordermyfood.Entity.Order;
import com.ordermyfood.Exception.OrderException;
import com.ordermyfood.Repository.OrderServiceRepository;
import com.ordermyfood.Service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
@Autowired
OrderServiceRepository orderServiceRepo;
	@Override
	public OrderResponse createOrder(OrderRequest orderRequest) {
		// TODO Auto-generated method stub
		List<Order> orders = orderServiceRepo.findByCustomerNameAndItemDetailName(orderRequest.getCustomerName(), orderRequest.getItemDetail().getName());
        OrderResponse orderResponse = null;
        if (orders != null && orders.size() == 0) {
            orderRequest.setTransactionId(UUID.randomUUID().toString());
            orderRequest.setTotalPrice(orderRequest.getItemDetail().getPrice() * orderRequest.getItemDetail().getQuantity());
            orderRequest.setOrderTime(System.currentTimeMillis());
            orderRequest.setDeliveryTime(System.currentTimeMillis() + 300000);
            orderRequest.setPaymentId(orderRequest.getCustomerCellNo() + "_ORG");

            orderResponse = new OrderResponse();
            Order order = new Order();
            BeanUtils.copyProperties(orderRequest, order);
            order.setStatus("NEW");
            orderServiceRepo.save(order);
            orderResponse.setRestaurantId(order.getRestaurantId());
            orderResponse.setOrderId(order.getOrderId());
            orderResponse.setTransactionId(UUID.randomUUID().toString());
            }
        return orderResponse;
	}
	

	@Override
	public OrderResponse updateOrder(OrderRequest orderRequest) throws OrderException {
		// TODO Auto-generated method stub
		OrderResponse orderResponse = null;
        List<Order> ordersForRestaurantId = orderServiceRepo.findByRestaurantId(orderRequest.getRestaurantId());

        if (ordersForRestaurantId != null && ordersForRestaurantId.size() == 0)
            throw new OrderException("order for updating not found");

        List<Order> ordersForCustomerNameAndItem = orderServiceRepo.findByCustomerNameAndItemDetailName(orderRequest.getCustomerName(), 
        		orderRequest.getItemDetail().getName());

        if (ordersForCustomerNameAndItem != null && ordersForCustomerNameAndItem.size() == 0)
            throw new OrderException("orders not found");

        if (ordersForCustomerNameAndItem != null && ordersForCustomerNameAndItem.size() == 1) {
            orderRequest.setTransactionId(UUID.randomUUID().toString());
            orderRequest.setTotalPrice(orderRequest.getItemDetail().getPrice() * orderRequest.getItemDetail().getQuantity());
            orderRequest.setPaymentId(orderRequest.getCustomerCellNo() + "_REVISED");
        }
        else throw new OrderException("orders not upadated");
        return orderResponse;	
        }

	@Override
	public OrderCancelResponse cancelOrder(OrderCancelRequest orderCancelRequest) throws OrderException {
		// TODO Auto-generated method stub
		String orderId = null;
		Order order = orderServiceRepo.getByOrderIdAndCustomerName(orderId, orderCancelRequest.getCustomerName());
		if (order == null) 
			throw new OrderException("cancelling order");
		OrderCancelResponse orderCancelResponse = new OrderCancelResponse();
		orderCancelResponse.setTransactionId(UUID.randomUUID().toString());
		return  orderCancelResponse;
			
	}

	@Override
	public List<Order> viewOrders(String customerName) throws OrderException {
		// TODO Auto-generated method stub
		 List<Order> orders = orderServiceRepo.findByCustomerName(customerName);
	        if (orders != null && orders.size() == 0) throw new OrderException("error");
	        return orders;
	}
	

}
