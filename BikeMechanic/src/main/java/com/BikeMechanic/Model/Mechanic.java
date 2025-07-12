package com.BikeMechanic.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mechanic {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int rating;
	private  String address;
	private int availabletime;
	private Long number;
	
	
	
	public Mechanic() {
		
	}

	public Mechanic(String name, int rating, String address, int availabletime,Long number) {
		super();
		this.name = name;
		this.rating = rating;
		this.address = address;
		this.availabletime = availabletime;
		this.number =number;
	}
			
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAvailabletime() {
		return availabletime;
	}
	public void setAvailabletime(int availabletime) {
		this.availabletime = availabletime;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	
	
}