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
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
	
	private int star; // out of 5
	
	private String review;

	public void setId(int id) {
		this.id = id;
	}

	// Getter for product
	public Product getProduct() {
		return product;
	}

	// Setter for product
	public void setProduct(Product product) {
		this.product = product;
	}

	// Getter for user
	public User getUser() {
		return user;
	}

	// Setter for user
	public void setUser(User user) {
		this.user = user;
	}

	// Getter for star
	public int getStar() {
		return star;
	}

	// Setter for star
	public void setStar(int star) {
		this.star = star;
	}

	// Getter for review
	public String getReview() {
		return review;
	}

	// Setter for review
	public void setReview(String review) {
		this.review = review;
	}
}

