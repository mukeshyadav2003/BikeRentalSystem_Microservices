package com.Bike.BikeRentalSystem.Model;

import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int age;
    private Long Number;
    private String Location;
    
    
    
	public CustomerDetails(String name, int age, Long number, String location) {
		super();
		this.name = name;
		this.age = age;
		this.Number = number;
		this.Location = location;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getNumber() {
		return Number;
	}
	public void setNumber(Long number) {
		Number = number;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
   
    
    
}
