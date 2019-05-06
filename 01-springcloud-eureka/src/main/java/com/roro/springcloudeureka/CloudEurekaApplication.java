package com.roro.springcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication.class, args);
        System.err.println("注意添加spring-cloud-starter-netflix-eureka-server依赖");
        System.err.println("注意添加@EnableEurekaServer");
        System.err.println("注意修改配置application.properties");
        System.err.println("启动，访问：http://127.0.0.1:9000");

        System.err.println("01-springcloud-eureka");
        System.err.println("01-ms-consumer-user");
        System.err.println("01-ms-provider-order");
        System.err.println("三个模块演示了服务注册中心、服务消费者、服务提供者");

    }
}
