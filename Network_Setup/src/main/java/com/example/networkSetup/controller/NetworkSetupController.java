package com.example.networkSetup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.networkSetup.entity.NetworkSetup;
import com.example.networkSetup.service.NetworkSetupService;

import java.util.List;

@RestController
@RequestMapping("/api/network-setups")
public class NetworkSetupController {

    @Autowired
    private NetworkSetupService networkSetupService;

    @GetMapping
    public List<NetworkSetup> getAllSetups() {
        return networkSetupService.getAllSetups();
    }

    @GetMapping("/{setupId}")
    public NetworkSetup getSetupById(@PathVariable Long setupId) {
        return networkSetupService.getSetupById(setupId);
    }
}

