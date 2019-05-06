package com.roro.springcloudconsumerribbon3600;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerRibbon3600Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerRibbon3600Application.class, args);
        System.out.println("");
    }

}
