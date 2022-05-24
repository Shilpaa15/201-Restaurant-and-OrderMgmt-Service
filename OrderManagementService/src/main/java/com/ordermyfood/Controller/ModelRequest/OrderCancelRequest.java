package com.ordermyfood.Controller.ModelRequest;

import java.util.Arrays;

public class OrderCancelRequest {
		private String[] orderIds;
	    private String customerName;
	    
		public OrderCancelRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "OrderCancelRequest [orderIds=" + Arrays.toString(orderIds) + ", customerName=" + customerName + "]";
		}

		public OrderCancelRequest(String[] orderIds, String customerName) {
			super();
			this.orderIds = orderIds;
			this.customerName = customerName;
		}

		public String[] getOrderIds() {
			return orderIds;
		}
		public void setOrderIds(String[] orderIds) {
			this.orderIds = orderIds;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}	
	}
