package com.Biikes.Bikes_section.Module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bike {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long bikeid;
	private String bikename;
	private double rent;
	private int bikeno;
    private String condtion;
    private int count;
    private String status;
    
    
	public Bike() {
	
	}
	
	public Bike(String bikename, double rent, int bikeno, String condtion,int count, String status) {
		super();
		this.bikename = bikename;
		this.rent = rent;
		this.bikeno = bikeno;
		this.condtion = condtion;
		this.count = count;
		this.status = status;
	}
	
	
	
	public Long getBikeid() {
		return bikeid;
	}

	public void setBikeid(Long bikeid) {
		this.bikeid = bikeid;
	}

	public String getBikename() {
		return bikename;
	}
	
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public int getBikeno() {
		return bikeno;
	}
	public void setBikeno(int bikeno) {
		this.bikeno = bikeno;
	}
	public String getCondtion() {
		return condtion;
	}
	public void setCondtion(String condtion) {
		this.condtion = condtion;
}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}