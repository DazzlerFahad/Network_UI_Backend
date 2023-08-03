package com.example.pip.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.pip.entity.DeviceDetails;

@Repository
public interface DeviceDetailsRepository extends JpaRepository<DeviceDetails, Long> {

	List<DeviceDetails> findAll();
	Optional<DeviceDetails> findById(Long deviceId);
}
