package com.example.networkSetup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.networkSetup.entity.NetworkSetup;
import com.example.networkSetup.repository.NetworkSetupRepository;

import java.util.List;

@Service
public class NetworkSetupService {

    @Autowired
    private NetworkSetupRepository networkSetupRepository;

    public List<NetworkSetup> getAllSetups() {
        return networkSetupRepository.findAll();
    }

    public NetworkSetup getSetupById(Long setupId) {
        return networkSetupRepository.findById(setupId).orElse(null);
    }
}

