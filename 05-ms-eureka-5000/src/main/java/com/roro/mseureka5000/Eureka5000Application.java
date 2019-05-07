package com.roro.mseureka5000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka5000Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka5000Application.class, args);
    }

}
