package com.petshop.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
	
	@ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
	
	private int quantity;
	
	private String addedTime;  // epoch time
	
	public int getId() {
		return id;
	}

	// Setter for id
	public void setId(int id) {
		this.id = id;
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

	// Getter for addedTime
	public String getAddedTime() {
		return addedTime;
	}

	// Setter for addedTime
	public void setAddedTime(String addedTime) {
		this.addedTime = addedTime;
	}
}
	

