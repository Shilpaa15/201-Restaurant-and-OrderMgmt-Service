package com.ordermyfood.Controller.ModelRequest;

import com.ordermyfood.Entity.ItemDetail;

public class OrderRequest {
		private String transactionId;
	    private String restaurantId;
	    private ItemDetail itemDetail;
	    private int totalPrice;
	    private long orderTime;
	    private String specialNote;
	    private long deliveryTime;
	    private String paymentId;
	    private String customerName;
	    private String customerCellNo;
	    
		public OrderRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public OrderRequest(String transactionId, String restaurantId, ItemDetail itemDetail, int totalPrice,
				long orderTime, String specialNote, long deliveryTime, String paymentId, String customerName,
				String customerCellNo) {
			super();
			this.transactionId = transactionId;
			this.restaurantId = restaurantId;
			this.itemDetail = itemDetail;
			this.totalPrice = totalPrice;
			this.orderTime = orderTime;
			this.specialNote = specialNote;
			this.deliveryTime = deliveryTime;
			this.paymentId = paymentId;
			this.customerName = customerName;
			this.customerCellNo = customerCellNo;
		}
		

		@Override
		public String toString() {
			return "OrderRequest [transactionId=" + transactionId + ", restaurantId=" + restaurantId + ", itemDetail="
					+ itemDetail + ", totalPrice=" + totalPrice + ", orderTime=" + orderTime + ", specialNote="
					+ specialNote + ", deliveryTime=" + deliveryTime + ", paymentId=" + paymentId + ", customerName="
					+ customerName + ", customerCellNo=" + customerCellNo + "]";
		}

		public String getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}
		public String getRestaurantId() {
			return restaurantId;
		}
		public void setRestaurantId(String restaurantId) {
			this.restaurantId = restaurantId;
		}
		public ItemDetail getItemDetail() {
			return itemDetail;
		}
		public void setItemDetail(ItemDetail itemDetail) {
			this.itemDetail = itemDetail;
		}
		public int getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}
		public long getOrderTime() {
			return orderTime;
		}
		public void setOrderTime(long orderTime) {
			this.orderTime = orderTime;
		}
		public String getSpecialNote() {
			return specialNote;
		}
		public void setSpecialNote(String specialNote) {
			this.specialNote = specialNote;
		}
		public long getDeliveryTime() {
			return deliveryTime;
		}
		public void setDeliveryTime(long deliveryTime) {
			this.deliveryTime = deliveryTime;
		}
		public String getPaymentId() {
			return paymentId;
		}
		public void setPaymentId(String paymentId) {
			this.paymentId = paymentId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerCellNo() {
			return customerCellNo;
		}
		public void setCustomerCellNo(String customerCellNo) {
			this.customerCellNo = customerCellNo;
		}
}
