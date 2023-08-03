package com.example.DeviceNetworkMapping.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.DeviceNetworkMapping.entity.DeviceNetworkMapping;
import com.example.DeviceNetworkMapping.entity.NetworkSetup;


@Repository
public interface DeviceNetworkMappingRepository extends JpaRepository<DeviceNetworkMapping, Long> {

    List<DeviceNetworkMapping> findByNetworkSetup(NetworkSetup networkSetup);
	
}

