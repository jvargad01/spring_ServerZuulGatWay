package com.api.zuulservergatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ServerZuulGatWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerZuulGatWayApplication.class, args);
	}

}
