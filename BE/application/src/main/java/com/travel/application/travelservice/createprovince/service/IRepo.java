package com.travel.application.travelservice.createprovince.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.createprovince.dto.CreateProvinceRequest;
@Repository
public interface IRepo  extends JpaRepository<ProvinceEntity, Integer>{	

}
