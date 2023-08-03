package com.example.DeviceNetworkMapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.DeviceNetworkMapping.entity.DeviceNetworkMapping;
import com.example.DeviceNetworkMapping.entity.NetworkSetup;
import com.example.DeviceNetworkMapping.service.DeviceNetworkMappingService;



@RestController
@RequestMapping("/api/device-network-mappings")
public class DeviceNetworkMappingController {


    @Autowired
    private DeviceNetworkMappingService deviceNetworkMappingService;

    @GetMapping("/device-mappings/by-network-setup/{setupId}")
    public ResponseEntity<List<DeviceNetworkMapping>> getDeviceMappingsByNetworkSetup(@PathVariable Long setupId) {
       
        NetworkSetup networkSetup = new NetworkSetup();
        networkSetup.setSetupid(setupId);

        List<DeviceNetworkMapping> deviceMappings = deviceNetworkMappingService.getDeviceMappingsByNetworkSetup(networkSetup);
        if (deviceMappings.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(deviceMappings);
    }

}