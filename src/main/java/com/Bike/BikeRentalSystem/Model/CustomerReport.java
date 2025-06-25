package com.Bike.BikeRentalSystem.Model;


import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerReport {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private String customerName;
	private String Report;
	private Long vechileid;
	
	
	
	public CustomerReport(String customerName, String report, Long vechileid) {
		super();
		this.customerName = customerName;
		this.Report = report;
		this.vechileid = vechileid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getReport() {
		return Report;
	}
	public void setReport(String report) {
		this.Report = report;
	}
	public Long getVechileid() {
		return vechileid;
	}
	public void setVechileid(Long vechileid) {
		this.vechileid = vechileid;
	}
	
		
	


	
	
}