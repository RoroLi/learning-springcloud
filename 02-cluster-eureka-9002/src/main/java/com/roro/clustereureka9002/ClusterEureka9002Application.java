package com.roro.clustereureka9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClusterEureka9002Application {

    public static void main(String[] args) {
        SpringApplication.run(ClusterEureka9002Application.class, args);
        System.err.println("演示Eureka集群，而且加入Eureka密码");
        System.err.println("02-cluster-eureka-9001和02-cluster-eureka-9002两种组成一个集群");
        System.err.println("说白了就是两者相互注册");
        System.err.println("三板斧");
        System.err.println("一、引入依赖spring-cloud-starter-netflix-eureka-server和spring-boot-starter-security");
        System.err.println("二、@EnableEurekaServer和com.roro.clustereureka9002.config.SecurityConfig");
        System.err.println("三、application.properties配置，相互注册和密码设置");
    }

}
