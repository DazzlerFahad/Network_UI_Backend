package com.example.pip.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pip.entity.DeviceDetails;
import com.example.pip.repository.DeviceDetailsRepository;

import java.util.List;

@Service
public class DeviceDetailsService {

    @Autowired
    private DeviceDetailsRepository deviceDetailsRepository;

    public List<DeviceDetails> getAllDevices() {
        return deviceDetailsRepository.findAll();
    }

    public DeviceDetails getDeviceById(Long deviceId) {
        return deviceDetailsRepository.findById(deviceId).orElse(null);
    }
}

