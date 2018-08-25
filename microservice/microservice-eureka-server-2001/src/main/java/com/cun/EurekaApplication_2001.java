package com.cun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 开启注册中心
public class EurekaApplication_2001 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication_2001.class, args);
	}
}