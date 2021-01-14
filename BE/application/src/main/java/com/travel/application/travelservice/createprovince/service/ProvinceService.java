package com.travel.application.travelservice.createprovince.service;

import java.util.List;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.createprovince.dto.CreateProvinceRequest;


public interface ProvinceService {

	void save(CreateProvinceRequest requestList);
}
