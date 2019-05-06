package com.roro.msconsumerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MSConsumerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MSConsumerDemoApplication.class, args);
        System.err.println("演示如何注册服务到Eureka集群，而且加入Eureka密码");
        System.err.println("02-cluster-eureka-9001和02-cluster-eureka-9002两种组成一个集群");
        System.err.println("注册服务三板斧");
        System.err.println("一、引入依赖spring-cloud-starter-netflix-eureka-client。千万不要引入spring-boot-starter-security");
        System.err.println("二、@EnableDiscoveryClient");
        System.err.println("三、application.properties配置");
        System.err.println("启动后访问：http://localhost:9021/hello");
    }

}
