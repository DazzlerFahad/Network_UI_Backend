package com.example.DeviceNetworkMapping.entity;

import javax.persistence.*;


@Entity
@Table(name = "device_network_mapping")
public class DeviceNetworkMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fromdeviceid", nullable = false)
    private DeviceDetails fromDevice;

    @ManyToOne
    @JoinColumn(name = "todeviceid", nullable = false)
    private DeviceDetails toDevice;

    @ManyToOne
    @JoinColumn(name = "setupid", nullable = false)
    private NetworkSetup networkSetup;

	public DeviceNetworkMapping() {
		
	}

	public DeviceNetworkMapping(Long id, DeviceDetails fromDevice, DeviceDetails toDevice, NetworkSetup networkSetup) {
		super();
		this.id = id;
		this.fromDevice = fromDevice;
		this.toDevice = toDevice;
		this.networkSetup = networkSetup;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DeviceDetails getFromDevice() {
		return fromDevice;
	}

	public void setFromDevice(DeviceDetails fromDevice) {
		this.fromDevice = fromDevice;
	}

	public DeviceDetails getToDevice() {
		return toDevice;
	}

	public void setToDevice(DeviceDetails toDevice) {
		this.toDevice = toDevice;
	}

	public NetworkSetup getNetworkSetup() {
		return networkSetup;
	}

	public void setNetworkSetup(NetworkSetup networkSetup) {
		this.networkSetup = networkSetup;
	}

	@Override
	public String toString() {
		return "DeviceNetworkMapping [id=" + id + ", fromDevice=" + fromDevice + ", toDevice=" + toDevice
				+ ", networkSetup=" + networkSetup + "]";
	}
	
	
    
    
    
}
