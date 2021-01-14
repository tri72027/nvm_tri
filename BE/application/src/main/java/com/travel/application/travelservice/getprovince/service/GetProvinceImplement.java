package com.travel.application.travelservice.getprovince.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.getprovince.dto.GetProvinceRequest;


@Service
public class GetProvinceImplement implements GetProvinceService {
	@Autowired
	public IRepoGetProvince repo;
	
	
	@Override
	public List<ProvinceEntity> get() {
		List<ProvinceEntity> listProvince = repo.findAll();
		// TODO Auto-generated method stub
		return listProvince;
	}


	@Override
	public GetProvinceRequest getid(int id ) {
		// TODO Auto-generated method stub
		Optional<ProvinceEntity> listProvince = repo.findById(id);
		GetProvinceRequest listProvinceID = new GetProvinceRequest();
		listProvinceID.setProvinceID(listProvince.get().getProvinceID());
		listProvinceID.setCode(listProvince.get().getCode());
		listProvinceID.setName(listProvince.get().getName());
		return listProvinceID;
	}


	

}
