package com.Bike.BikeRentalSystem.Model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdminDetails {

	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Long id;
	  private String name;
	  private String password;
	  private int RcBookNo;
	  private Long mobileNo;
	  
	  

	
	
	public AdminDetails( String name, String password, int rcBookNo, Long mobileNo) {
		super();
		
		this.name = name;
		this.password = password;
		this.RcBookNo = rcBookNo;
		this.mobileNo = mobileNo;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRcBookNo() {
		return RcBookNo;
	}
	public void setRcBookNo(int rcBookNo) {
		RcBookNo = rcBookNo;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	  
	  
}
