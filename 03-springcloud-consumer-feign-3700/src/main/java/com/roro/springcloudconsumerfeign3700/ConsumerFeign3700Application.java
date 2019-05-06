package com.roro.springcloudconsumerfeign3700;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.roro.springcloudconsumerfeign3700")
public class ConsumerFeign3700Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign3700Application.class, args);
    }

}
