package com.travel.application.travelservice.getprovince.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.getprovince.dto.GetProvinceRequest;
import com.travel.application.travelservice.getprovince.service.GetProvinceService;
@RestController
@CrossOrigin()
public class GetProvinceController {
	@Autowired
	public GetProvinceService service;

	@GetMapping("/getall")

	@ResponseBody
	public List<ProvinceEntity> get() {
		List<ProvinceEntity> list = service.get();
		return list;
	}
	
	@GetMapping("/getid")

	@ResponseBody
	public GetProvinceRequest getid(@RequestBody int id) {
		GetProvinceRequest list = service.getid(id);
		return list;
	}

}
