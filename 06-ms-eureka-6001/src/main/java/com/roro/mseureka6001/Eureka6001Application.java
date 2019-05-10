package com.roro.mseureka6001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka6001Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka6001Application.class, args);
        System.out.println("06模块的注册中心");
        System.out.println("启动，访问    http://127.0.0.1:6001/");
    }

}
