package com.roro.msconsumerhystrixfeign5200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.roro")
@EnableCircuitBreaker
public class ConsumerHystrixFeign5200Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixFeign5200Application.class, args);
        System.err.println("相对05-ms-comsumer-hystrix-command-5100模块");
        System.err.println("本模块演示了feign+hystrix的使用");

        System.err.println("一、加依赖");
        System.err.println("二、注解@EnableDiscoveryClient、EnableFeignClients、EnableCircuitBreaker");
        System.err.println("三、application.properties");

        System.err.println("启动：访问");
        System.err.println("http://localhost:5200/call/moo");
        System.err.println("http://localhost:5200/callNoFallBack/moo");


        System.err.println("----------------------");
        System.err.println("另外本模块还增加了hystrix.stream");
        System.err.println("一、加依赖spring-boot-starter-actuator");
        System.err.println("二、注解@EnableCircuitBreaker");
        System.err.println("三、加入监控端点配置:(spring cloud的E版本是不需要加入的 F版本需要加入) Cgf.java下 ServletRegistrationBean");

        System.err.println("访问http://localhost:5200/hystrix.stream");
        System.err.println("访问http://localhost:5200/call/moo就可以看到访问http://localhost:5200/hystrix.stream里有变化");



    }

}
