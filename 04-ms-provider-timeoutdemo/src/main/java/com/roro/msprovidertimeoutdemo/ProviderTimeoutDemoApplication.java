package com.roro.msprovidertimeoutdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProviderTimeoutDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTimeoutDemoApplication.class, args);
        System.out.println("04-ms-provider-timeoutdemo、04-ms-consumer-timeoutdemo");
        System.out.println("这两个模块公共演示了，当consumer调用provider出现超时异常时该如何处理");
        System.out.println("04-ms-provider-timeoutdemo提供了一个超简单服务，服务里睡眠了2秒");
        System.out.println("注：这次并没有用注册中心，consumer直接写死了调用哪个服务");
        System.out.println("注：04只是演示没有引入Hystrix之前是如何处理的");
    }

}
