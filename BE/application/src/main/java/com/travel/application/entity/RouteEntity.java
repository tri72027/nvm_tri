package com.travel.application.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "route")

public class RouteEntity {

	public RouteEntity() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "route_id", nullable = false)
	private int routeID;

	@Column(name = "province_start", nullable = false)
	private int provinceStart;
	@Column(name = "province_end", nullable = false)
	private int provinceEnd;
	@Column(name = "price", length = 10, nullable = false)
	private long price;
	@Column(name = "departure_time")
	private String departureTime;
	@Column(name = "journey_time")
	private String journeyTime;

	

	public int getRouteID() {
		return routeID;
	}

	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}

	public int getProvinceStart() {
		return provinceStart;
	}

	public void setProvinceStart(int provinceStart) {
		this.provinceStart = provinceStart;
	}

	public int getProvinceEnd() {
		return provinceEnd;
	}

	public void setProvinceEnd(int provinceEnd) {
		this.provinceEnd = provinceEnd;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getJourneyTime() {
		return journeyTime;
	}

	public void setJourneyTime(String journeyTime) {
		this.journeyTime = journeyTime;
	}

	@Override
	public String toString() {
		return this.getRouteID() + ", " + this.getProvinceStart() + ", " + this.getProvinceEnd() + ", " + this.getPrice()
				+ ", " + this.getDepartureTime() + ", " + this.getJourneyTime();
	}

	@OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
	private List<TripEntity> trips;

	public List<TripEntity> getTrip() {
		return trips;
	}

	public void setTrip(List<TripEntity> trip) {
		this.trips = trips;
	}

}
