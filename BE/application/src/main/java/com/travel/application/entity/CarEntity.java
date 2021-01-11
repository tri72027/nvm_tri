package com.travel.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class CarEntity {

	public CarEntity() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id", nullable = false)
	private int carID;
	
	@Column(name = "code", length = 10, nullable = false)
	private String code;
	
	@Column(name = "name", length = 45, nullable = false)
	private String name;
	
	@Column(name = "price", length = 10)
	private long price;
	
	@Column(name = "amount")
	private int amount;

	

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
    public String toString() {
        return this.getCarID() + ", " + this.getCode() + ", " + this.getName()+ ", " + this.getPrice()+ ", " + this.getAmount();
    }
}
