package com.test.besttripadmin;



import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@EnableAdminServer
public class BesttripadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BesttripadminApplication.class, args);
	}

}
