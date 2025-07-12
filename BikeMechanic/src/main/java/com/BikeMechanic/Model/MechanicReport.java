package com.BikeMechanic.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MechanicReport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String report;
	private int bikeno;
	private float charge;
	
	
	public MechanicReport() {
		
	}
	
	public MechanicReport( String name, String report, int bikeno, float charge) {
		super();
		this.name = name;
		this.report = report;
		this.bikeno = bikeno;
		this.charge = charge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public int getBikeno() {
		return bikeno;
	}
	public void setBikeno(int bikeno) {
		this.bikeno = bikeno;
	}
	public float getCharge() {
		return charge;
	}
	public void setCharge(float charge) {
		this.charge = charge;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
