package com.jpdev.hrconfgserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrConfgServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrConfgServerApplication.class, args);
	}

}
