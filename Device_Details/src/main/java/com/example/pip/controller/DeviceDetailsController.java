package com.example.pip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pip.entity.DeviceDetails;
import com.example.pip.service.DeviceDetailsService;
import java.util.List;

@RestController
@RequestMapping("/api/device-details")
public class DeviceDetailsController {

	@Autowired
    private DeviceDetailsService deviceDetailsService;

    @GetMapping
    public List<DeviceDetails> getAllDevices() {
        return deviceDetailsService.getAllDevices();
    }

    @GetMapping("/{deviceId}")
    public DeviceDetails getDeviceById(@PathVariable Long deviceId) {
        return deviceDetailsService.getDeviceById(deviceId);
    }
}

