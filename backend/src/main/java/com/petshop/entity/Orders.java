package com.petshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String orderId;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
	
	@ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

	private int quantity;
	
	private String orderTime;
	
	private String status;  // Processing, Delivered, On the Way // this will be for customer
	
	// delivery properties
	
	// updated by seller
	@ManyToOne
    @JoinColumn(name = "delivery_person_id")
    private User deliveryPerson;
	
	//updated by delivery person
	private String deliveryTime;  // Evening, Morning, Afternoon, Night
	
	private String deliveryDate; 
	
	private String deliveryStatus;  // Delivered, Pending // this will be for actual delivery status

	// Getter for id
		public int getId() {
			return id;
		}

		// Setter for id
		public void setId(int id) {
			this.id = id;
		}

		// Getter for orderId
		public String getOrderId() {
			return orderId;
		}

		// Setter for orderId
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		// Getter for user
		public User getUser() {
			return user;
		}

		// Setter for user
		public void setUser(User user) {
			this.user = user;
		}

		// Getter for product
		public Product getProduct() {
			return product;
		}

		// Setter for product
		public void setProduct(Product product) {
			this.product = product;
		}

		// Getter for quantity
		public int getQuantity() {
			return quantity;
		}

		// Setter for quantity
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		// Getter for orderTime
		public String getOrderTime() {
			return orderTime;
		}

		// Setter for orderTime
		public void setOrderTime(String orderTime) {
			this.orderTime = orderTime;
		}

		// Getter for status
		public String getStatus() {
			return status;
		}

		// Setter for status
		public void setStatus(String status) {
			this.status = status;
		}

		// Getter for deliveryPerson
		public User getDeliveryPerson() {
			return deliveryPerson;
		}

		// Setter for deliveryPerson
		public void setDeliveryPerson(User deliveryPerson) {
			this.deliveryPerson = deliveryPerson;
		}

		// Getter for deliveryTime
		public String getDeliveryTime() {
			return deliveryTime;
		}

		// Setter for deliveryTime
		public void setDeliveryTime(String deliveryTime) {
			this.deliveryTime = deliveryTime;
		}

		// Getter for deliveryDate
		public String getDeliveryDate() {
			return deliveryDate;
		}

		// Setter for deliveryDate
		public void setDeliveryDate(String deliveryDate) {
			this.deliveryDate = deliveryDate;
		}

		// Getter for deliveryStatus
		public String getDeliveryStatus() {
			return deliveryStatus;
		}

		// Setter for deliveryStatus
		public void setDeliveryStatus(String deliveryStatus) {
			this.deliveryStatus = deliveryStatus;
		}
}
