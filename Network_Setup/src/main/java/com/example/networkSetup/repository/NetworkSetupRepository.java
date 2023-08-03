package com.example.networkSetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.networkSetup.entity.NetworkSetup;


@Repository
public interface NetworkSetupRepository extends JpaRepository<NetworkSetup, Long> {
	
	// Spring Data JPA will automatically generate the implementation for services methods
    // findAll() will fetch all records from the 'NetworkSetup' table
    // findById(setupId) will find a record by its primary key 'setupId'
	
}