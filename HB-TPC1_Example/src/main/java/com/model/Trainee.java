package com.model;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="Trainee")

public class Trainee extends Employee {
	float payerhour;
	String Contractperiod;
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	
	public Trainee(float payerhour, String contractperiod, String name) {
		super(name);
		this.payerhour = payerhour;
		Contractperiod = contractperiod;
	}

	public float getPayerhour() {
		return payerhour;
	}
	public void setPayerhour(float payerhour) {
		this.payerhour = payerhour;
	}
	public String getContractperiod() {
		return Contractperiod;
	}
	public void setContractperiod(String contractperiod, String name) {
		Contractperiod = contractperiod;
	}
	

}
