package com.algaworks.osworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan(basePackages = {"com.algaworks.osworks"})
//@EntityScan(basePackages = {"com.algaworks.osworks.domain.model"})
@SpringBootApplication
public class OsworksApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsworksApiApplication.class, args);
	}

}
