package com.roro.msconsumerhystrixcommand5100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
public class ConsumerHystrixCommand5100Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixCommand5100Application.class, args);
        System.err.println("本模块演示HystrixComman的使用");
        System.err.println("启动");
        System.err.println("http://localhost:5100/say1/moo");
        System.err.println("http://localhost:5100/say2/moo");
        System.err.println("http://localhost:5100/say3/moo");

        System.err.println("localhost:5100/actuator/health");

        System.err.println("相对于04模块，HystrixComman，对降级比较友好了");


    }

}
