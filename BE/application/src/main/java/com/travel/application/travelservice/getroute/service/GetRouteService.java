package com.travel.application.travelservice.getroute.service;

import java.util.List;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.RouteEntity;
import com.travel.application.travelservice.getroute.dto.GetRouteRequest;

public interface GetRouteService {

	public BaseResponse getAll();
	public BaseResponse getProvinceStart(GetRouteRequest req);
	public GetRouteRequest getbyId();
	

}
