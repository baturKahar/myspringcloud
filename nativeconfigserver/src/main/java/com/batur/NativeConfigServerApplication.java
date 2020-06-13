package com.batur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NativeConfigServerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(NativeConfigServerApplication.class, args);
	}

}
