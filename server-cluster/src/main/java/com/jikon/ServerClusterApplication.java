package com.jikon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerClusterApplication.class, args);
	}
}
