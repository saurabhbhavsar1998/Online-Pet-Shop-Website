package com.petshop.entity;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String description;

	private BigDecimal price;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
	private Category category;
	
	private int quantity;
	
	private String status;
	
	@ManyToOne
    @JoinColumn(name = "seller_user_id")
    private User seller;
	
	private String image1;
	
	private String image2;
	
	private String image3;
	
	// Getter for id
		public int getId() {
			return id;
		}

		// Setter for id
		public void setId(int id) {
			this.id = id;
		}

		// Getter for name
		public String getName() {
			return name;
		}

		// Setter for name
		public void setName(String name) {
			this.name = name;
		}

		// Getter for description
		public String getDescription() {
			return description;
		}

		// Setter for description
		public void setDescription(String description) {
			this.description = description;
		}

		// Getter for price
		public BigDecimal getPrice() {
			return price;
		}

		// Setter for price
		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		// Getter for category
		public Category getCategory() {
			return category;
		}

		// Setter for category
		public void setCategory(Category category) {
			this.category = category;
		}

		// Getter for quantity
		public int getQuantity() {
			return quantity;
		}

		// Setter for quantity
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		// Getter for status
		public String getStatus() {
			return status;
		}

		// Setter for status
		public void setStatus(String status) {
			this.status = status;
		}

		// Getter for seller
		public User getSeller() {
			return seller;
		}

		// Setter for seller
		public void setSeller(User seller) {
			this.seller = seller;
		}

		// Getter for image1
		public String getImage1() {
			return image1;
		}

		// Setter for image1
		public void setImage1(String image1) {
			this.image1 = image1;
		}

		// Getter for image2
		public String getImage2() {
			return image2;
		}

		// Setter for image2
		public void setImage2(String image2) {
			this.image2 = image2;
		}

		// Getter for image3
		public String getImage3() {
			return image3;
		}

		// Setter for image3
		public void setImage3(String image3) {
			this.image3 = image3;
		}
	}

