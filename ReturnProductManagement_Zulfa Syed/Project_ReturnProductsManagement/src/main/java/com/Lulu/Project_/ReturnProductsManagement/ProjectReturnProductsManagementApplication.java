package com.Lulu.Project_.ReturnProductsManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class ProjectReturnProductsManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectReturnProductsManagementApplication.class, args);
	}

}
