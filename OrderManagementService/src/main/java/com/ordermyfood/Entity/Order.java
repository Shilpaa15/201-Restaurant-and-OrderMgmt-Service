package com.ordermyfood.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Order")
public class Order {
	@Id
    String id;
    private String orderId ;
    private String restaurantId;
    private int totalPrice;
    private long orderTime;
    private String specialNote;
    private long deliveryTime;
    private String paymentId;
    private String customerName;
    private String customerCellNo;
    private String status;
    @OneToOne
    @JoinColumn(name="id")
    private ItemDetail itemDetail;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String id, String orderId, String restaurantId, ItemDetail itemDetail, int totalPrice, long orderTime,
			String specialNote, long deliveryTime, String paymentId, String customerName, String customerCellNo,
			String status) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.restaurantId = restaurantId;
		this.totalPrice = totalPrice;
		this.orderTime = orderTime;
		this.specialNote = specialNote;
		this.deliveryTime = deliveryTime;
		this.paymentId = paymentId;
		this.customerName = customerName;
		this.customerCellNo = customerCellNo;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ItemDetail getItemDetail() {
		return itemDetail;
	}
	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}
}