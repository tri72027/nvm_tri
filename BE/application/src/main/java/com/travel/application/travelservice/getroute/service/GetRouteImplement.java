package com.travel.application.travelservice.getroute.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.ProvinceEntity;
import com.travel.application.entity.RouteEntity;
import com.travel.application.travelservice.getprovince.dto.GetProvinceReponse;
import com.travel.application.travelservice.getprovince.service.IRepoGetProvince;
import com.travel.application.travelservice.getroute.dto.GetRouteRequest;
import com.travel.application.travelservice.getroute.dto.GetRouteResponse;

@Service
public class GetRouteImplement implements GetRouteService {
	@Autowired
	public IRepoGetRoute repo;
	
	@Autowired
	public IRepoGetProvince repoProvine;

	@Override
	public BaseResponse getAll() {

		BaseResponse cmRep = new BaseResponse();
		List<RouteEntity> list = repo.findAll();
		if (list.isEmpty()) {
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		List<GetRouteResponse> rep = list.stream().map(GetRouteResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		// TODO Auto-generated method stub
		return cmRep;
	}

	@Override
	public BaseResponse getProvinceStart(GetRouteRequest req) {

		BaseResponse cmRep = new BaseResponse();
		Optional<ProvinceEntity> provinceStart = repoProvine.findById(req.getProvinceStart());
		RouteEntity list = repo.findRouteByProvinceStart(provinceStart.get().getProvinceID());

		cmRep.setContent(list);
		
		// TODO Auto-generated method stub
		return cmRep;

	}

	@Override
	public GetRouteRequest getbyId() {
		// TODO Auto-generated method stub

		return null;
	}

}
