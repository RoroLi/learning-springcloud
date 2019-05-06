package com.roro.springcloudconsumerfeign3800;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerFeign3800Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign3800Application.class, args);
        System.out.println("本模块演示了Feign简单使用");
        System.out.println("一、加入依赖spring-cloud-starter-netflix-eureka-client、spring-cloud-starter-openfeign");
        System.out.println("加入依赖spring-boot-starter-web，比较神奇https://blog.csdn.net/solocoder/article/details/82182533");
        System.out.println("二、@EnableEurekaClient @EnableFeignClients");
        System.out.println("三、application.properties");

        System.out.println("启动：03-springcloud-eureka-3000");
        System.out.println("启动：03-springcloud-provider-simple-3100");
        System.out.println("启动：03-springcloud-provider-simple-3200");
        System.out.println("启动：本模块");
        System.out.println("访问：http://localhost:3800/index");
        System.out.println("访问：http://localhost:3800/say/你好");

    }

}
