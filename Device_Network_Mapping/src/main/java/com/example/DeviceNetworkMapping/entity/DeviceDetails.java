package com.example.DeviceNetworkMapping.entity;

import javax.persistence.*;

@Entity
@Table( name = "device_details")
public class DeviceDetails {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long deviceid;

	    @Column(name = "device_name", nullable = false)
	    private String deviceName;

	    @Column(name = "device_type", nullable = false)
	    private String deviceType;

	    @Column(name = "mac_address", nullable = false)
	    private String macAddress;

	    @Column(name = "ip_address", nullable = false)
	    private String ipAddress;

	    @Column(name = "location", nullable = false)
	    private String location;

	    @ManyToOne
	    @JoinColumn(name = "setupid", nullable = false)
	    private NetworkSetup networkSetup;
	    
	public DeviceDetails() {
		
	}

	public DeviceDetails(Long deviceid, String deviceName, String deviceType, String macAddress, String ipAddress,
			String location, NetworkSetup networkSetup) {
		super();
		this.deviceid = deviceid;
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.macAddress = macAddress;
		this.ipAddress = ipAddress;
		this.location = location;
		this.networkSetup = networkSetup;
	}

	public Long getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(Long deviceid) {
		this.deviceid = deviceid;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public NetworkSetup getNetworkSetup() {
		return networkSetup;
	}

	public void setNetworkSetup(NetworkSetup networkSetup) {
		this.networkSetup = networkSetup;
	}

	@Override
	public String toString() {
		return "DeviceDetails [deviceid=" + deviceid + ", deviceName=" + deviceName + ", deviceType=" + deviceType
				+ ", macAddress=" + macAddress + ", ipAddress=" + ipAddress + ", location=" + location
				+ ", networkSetup=" + networkSetup + "]";
	}

}

