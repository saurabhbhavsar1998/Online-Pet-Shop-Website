package com.petshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String street;

	private String city;

	private int pincode;
	
	public int getId() {
		return id;
	}

	// Setter for id
	public void setId(int id) {
		this.id = id;
	}

	// Getter for street
	public String getStreet() {
		return street;
	}

	// Setter for street
	public void setStreet(String street) {
		this.street = street;
	}

	// Getter for city
	public String getCity() {
		return city;
	}

	// Setter for city
	public void setCity(String city) {
		this.city = city;
	}

	
	public int getpincode() {
		return pincode;
	}

	
	public void setpincode(int pincode) {
		this.pincode = pincode;
	}
}


