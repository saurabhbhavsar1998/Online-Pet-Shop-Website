package com.petshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String firstName;

	private String lastName;

	private String emailId;

	@JsonIgnore
	private String password;

	private String phoneNo;

	private String role;

	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;

	@ManyToOne
	@JoinColumn(name = "seller_id")
	private User seller;

	private String status;
	
	public int getId() {
		return id;
	}

	// Setter for id
	public void setId(int id) {
		this.id = id;
	}

	// Getter for firstName
	public String getFirstName() {
		return firstName;
	}

	// Setter for firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Getter for lastName
	public String getLastName() {
		return lastName;
	}

	// Setter for lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Getter for emailId
	public String getEmailId() {
		return emailId;
	}

	// Setter for emailId
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	// Getter for password
	public String getPassword() {
		return password;
	}

	// Setter for password
	public void setPassword(String password) {
		this.password = password;
	}

	// Getter for phoneNo
	public String getPhoneNo() {
		return phoneNo;
	}

	// Setter for phoneNo
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	// Getter for role
	public String getRole() {
		return role;
	}

	// Setter for role
	public void setRole(String role) {
		this.role = role;
	}

	// Getter for address
	public Address getAddress() {
		return address;
	}

	// Setter for address
	public void setAddress(Address address) {
		this.address = address;
	}

	// Getter for seller
	public User getSeller() {
		return seller;
	}

	// Setter for seller
	public void setSeller(User seller) {
		this.seller = seller;
	}

	// Getter for status
	public String getStatus() {
		return status;
	}

	// Setter for status
	public void setStatus(String status) {
		this.status = status;
	}

}
