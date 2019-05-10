package com.roro.msgatewayzuulfallback6062;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZuulFallback6062Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulFallback6062Application.class, args);
    }

}
