package com.example.DeviceNetworkMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.example.DeviceNetworkMapping.filter.CustomCorsFilter;

@SpringBootApplication
@EnableEurekaClient
public class DeviceNetworkMappingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeviceNetworkMappingApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean<CustomCorsFilter> corsFilterRegistration() {
        FilterRegistrationBean<CustomCorsFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CustomCorsFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}





