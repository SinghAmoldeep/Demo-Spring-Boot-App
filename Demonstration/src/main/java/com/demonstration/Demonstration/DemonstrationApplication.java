package com.demonstration.Demonstration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemonstrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemonstrationApplication.class, args);
	}

}
