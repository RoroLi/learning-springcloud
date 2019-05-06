package com.roro.msprovidersimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderSimpleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderSimpleApplication.class, args);
        System.out.println("SpringCloud项目几乎都是三板斧");
        System.out.println("比如说这个模块是一个服务提供者模块");
        System.out.println("一、增加依赖spring-cloud-starter-netflix-eureka-client");
        System.out.println("二、添加注解@EnableDiscoveryClient或@EnableEurekaClient。但事实上高版本可省略");
        System.out.println("三、修改application.properties");

    }

}
