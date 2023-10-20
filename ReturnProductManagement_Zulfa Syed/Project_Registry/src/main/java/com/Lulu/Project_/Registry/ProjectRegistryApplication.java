package com.Lulu.Project_.Registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ProjectRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectRegistryApplication.class, args);
	}

}
