package com.jikon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerCluster2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServerCluster2Application.class, args);
	}
}
