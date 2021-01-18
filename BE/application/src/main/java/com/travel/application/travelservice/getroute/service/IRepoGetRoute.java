package com.travel.application.travelservice.getroute.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.entity.RouteEntity;

@Repository
public interface IRepoGetRoute extends JpaRepository<RouteEntity, Integer> {
	
	public RouteEntity findRouteByProvinceStart(int provinceStart);
}
