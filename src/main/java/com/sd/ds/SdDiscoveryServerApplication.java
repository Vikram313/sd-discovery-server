package com.sd.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SdDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdDiscoveryServerApplication.class, args);
	}

}
