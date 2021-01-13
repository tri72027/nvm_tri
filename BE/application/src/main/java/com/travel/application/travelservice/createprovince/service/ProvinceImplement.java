package com.travel.application.travelservice.createprovince.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.createprovince.dto.CreateProvinceRequest;
import com.travel.application.travelservice.createprovince.dto.ProvinceRequest;

@Service
public class ProvinceImplement implements ProvinceService {
	@Autowired
	public IRepo repo;
	
	
	@Override
	public List<ProvinceEntity> get() {
		List<ProvinceEntity> listProvince = repo.findAll();
		// TODO Auto-generated method stub
		return listProvince;
	}


	@Override
	public void save(ProvinceRequest requestList) {
		
		
			ProvinceEntity province = new ProvinceEntity();
			province.setCode(requestList.getCode());	
			province.setName(requestList.getName());
			repo.save(province);
		
	
	}
	

}
