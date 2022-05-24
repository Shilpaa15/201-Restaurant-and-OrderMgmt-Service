package com.ordermyfood.Service;

import java.util.List;

import com.ordermyfood.Controller.ModelRequest.OrderCancelRequest;
import com.ordermyfood.Controller.ModelRequest.OrderCancelResponse;
import com.ordermyfood.Controller.ModelRequest.OrderRequest;
import com.ordermyfood.Controller.ModelRequest.OrderResponse;
import com.ordermyfood.Entity.Order;
import com.ordermyfood.Exception.OrderException;

public interface OrderService {
	OrderResponse createOrder(OrderRequest orderRequest);

    public OrderResponse updateOrder(OrderRequest orderRequest) throws OrderException;

    public OrderCancelResponse cancelOrder(OrderCancelRequest orderCancelRequest) throws OrderException;

    public List<Order> viewOrders(String customerName) throws OrderException;
}
