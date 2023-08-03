# Network_UI_Backend
This project contains the microservices of Device Details, Network Setups & Device Network mapping with Proper API Gateway.
Network Setup: 
  Contains different setups With ID and Name.
Device Details:
  Contains the Details of different devices like DeviceName, Type, IP Address etc.
Device Network mappin:
  Contains the details of devices connected with which network setup and also gives the devices details w.r.t network setup.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
APIs:

API Gateway APIs:

1. For device details:
	http://localhost:9090/api/device-details

2. For network setups:
	http://localhost:9090/api/network-setups

3. For device network mapping:
	http://localhost:9090/api/device-network-mappings/device-mappings/by-network-setup/1

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Microservices APIs:

1. For device details:
	http://localhost:8080/api/device-details

2. For network setups:
	http://localhost:8081/api/network-setups

3. For device network mapping:
	http://localhost:8082/api/device-network-mappings/device-mappings/by-network-setup/1

