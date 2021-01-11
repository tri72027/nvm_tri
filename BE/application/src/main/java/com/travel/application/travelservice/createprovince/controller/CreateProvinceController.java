package com.travel.application.travelservice.createprovince.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.createprovince.service.ProvinceService;

@RestController
@CrossOrigin ()
public class CreateProvinceController {
 @Autowired
 public ProvinceService service;
 
	@GetMapping("/")
	@ResponseBody
	public List<ProvinceEntity> home ()
	{
		List<ProvinceEntity> list =  service.get();
		return list;
	}
}
