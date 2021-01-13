package com.travel.application.travelservice.createprovince.service;

import java.util.List;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.createprovince.dto.CreateProvinceRequest;
import com.travel.application.travelservice.createprovince.dto.ProvinceRequest;

public interface ProvinceService {
	List<ProvinceEntity> get();
	void save(ProvinceRequest requestList);
}
