package com.example.DeviceNetworkMapping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "network_setups")
public class NetworkSetup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long setupid;
    
    private String setupName;

	public NetworkSetup() {
		
	}

	public NetworkSetup(Long setupid, String setupName) {
		super();
		this.setupid = setupid;
		this.setupName = setupName;
	}

	public Long getSetupid() {
		return setupid;
	}

	public void setSetupid(Long setupid) {
		this.setupid = setupid;
	}

	public String getSetupName() {
		return setupName;
	}

	public void setSetupName(String setupName) {
		this.setupName = setupName;
	}

	@Override
	public String toString() {
		return "NetworkSetup [setupid=" + setupid + ", setupName=" + setupName + "]";
	}


}

