package com.SaudDev.Tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

	/* server.port = ${PORT:8081}
server.address=0.0.0.0
spring.application.name=Tasks
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=${jdbc:postgresql://localhost:5432/postgres}
spring.datasource.username=${postgres}
spring.datasource.password=${Saud123}

spring.jpa.hibernate.ddl-auto=update */

}
