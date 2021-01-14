package com.travel.application.travelservice.createprovince.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.createprovince.dto.CreateProvinceRequest;
import com.travel.application.travelservice.createprovince.service.ProvinceService;
import com.travel.application.travelservice.createprovince.dto.CreateProvinceRequest;

@RestController
@CrossOrigin()
public class CreateProvinceController {
	@Autowired
	public ProvinceService service;

	
	@PostMapping("/save")
	@ResponseBody
	public String create(@RequestBody CreateProvinceRequest CreateProvinceRequest) {
		service.save(CreateProvinceRequest);
		return "succes";

	}

	@PostMapping("/save/{code}/{name}")
	@ResponseBody
	public String create(@PathVariable("code") String code, @PathVariable("name") String name, Model model) {
		model.addAttribute("code", code);
		model.addAttribute("name", name);
		CreateProvinceRequest ProvinceRequest = new CreateProvinceRequest();
		ProvinceRequest.setCode(code);
		ProvinceRequest.setName(name);
		service.save(ProvinceRequest);
		return "succes";

	}
}
