package com.travel.application.travelservice.createprovince.dto;

import java.util.List;

public class CreateProvinceRequest {
	public List<ProvinceRequest> listProvince;
	
	public CreateProvinceRequest() {
	
	}

	public CreateProvinceRequest(List<ProvinceRequest> listProvince) {
		this.listProvince = listProvince;
	}

	public List<ProvinceRequest> getListProvince() {
		return listProvince;
	}

	public void setListProvince(List<ProvinceRequest> listProvince) {
		this.listProvince = listProvince;
	}
	
}
