package com.roro.msproviderdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MSProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MSProviderDemoApplication.class, args);
        System.err.println("演示如何注册服务到Eureka集群，而且加入Eureka密码");
        System.err.println("02-cluster-eureka-9001和02-cluster-eureka-9002两种组成一个集群");
        System.err.println("注册服务三板斧");
        System.err.println("一、引入依赖spring-cloud-starter-netflix-eureka-client。千万不要引入spring-boot-starter-security");
        System.err.println("二、@EnableDiscoveryClient");
        System.err.println("三、application.properties配置");
    }

}
