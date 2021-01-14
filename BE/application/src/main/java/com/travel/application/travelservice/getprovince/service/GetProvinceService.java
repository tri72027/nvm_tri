package com.travel.application.travelservice.getprovince.service;

import java.util.List;
import java.util.Optional;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.getprovince.dto.GetProvinceRequest;


public interface GetProvinceService {
	List<ProvinceEntity> get();
	GetProvinceRequest getid(int id);

}
