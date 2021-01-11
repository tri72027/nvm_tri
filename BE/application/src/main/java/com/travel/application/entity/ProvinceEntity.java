package com.travel.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "province")

public class ProvinceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "province_id", nullable = false)
	private int provinceID;
	
	@Column(name = "code", length = 10, nullable = false)
	private String code;
	@Column(name = "name", length = 45, nullable = false)
	private String name;
	
	public int getProvinceID() {
		return provinceID;
	}
	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
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
	 @Override
	    public String toString() {
	        return this.getProvinceID() + ", " + this.getCode() + ", " + this.getName();
	    }
}
