package com.ordermyfood.Controller.ModelRequest;

import java.util.UUID;

public class OrderResponse {
		private String transactionId;
	    private String orderId = UUID.randomUUID().toString();
	    private String status;
	    private String restaurantId;
	    
		public OrderResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public OrderResponse(String transactionId, String orderId, String status, String restaurantId) {
			super();
			this.transactionId = transactionId;
			this.orderId = orderId;
			this.status = status;
			this.restaurantId = restaurantId;
		}

		@Override
		public String toString() {
			return "OrderResponse [transactionId=" + transactionId + ", orderId=" + orderId + ", status=" + status
					+ ", restaurantId=" + restaurantId + "]";
		}

		public String getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}
		public String getOrderId() {
			return orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getRestaurantId() {
			return restaurantId;
		}
		public void setRestaurantId(String restaurantId) {
			this.restaurantId = restaurantId;
		}
	    
	}
