package com.roro.mseureka6000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka6000Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka6000Application.class, args);
        System.out.println("06模块的注册中心");
    }

}
