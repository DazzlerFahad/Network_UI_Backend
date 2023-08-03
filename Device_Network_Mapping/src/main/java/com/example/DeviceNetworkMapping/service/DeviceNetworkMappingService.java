package com.example.DeviceNetworkMapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.DeviceNetworkMapping.entity.DeviceNetworkMapping;
import com.example.DeviceNetworkMapping.entity.NetworkSetup;
import com.example.DeviceNetworkMapping.repositroy.DeviceNetworkMappingRepository;




@Service
public class DeviceNetworkMappingService {
	
	@Autowired
	private DeviceNetworkMappingRepository deviceNetworkMappingRepository;

	  public List<DeviceNetworkMapping> getDeviceMappingsByNetworkSetup(NetworkSetup networkSetup) {
	        return deviceNetworkMappingRepository.findByNetworkSetup(networkSetup);
	    }

}

