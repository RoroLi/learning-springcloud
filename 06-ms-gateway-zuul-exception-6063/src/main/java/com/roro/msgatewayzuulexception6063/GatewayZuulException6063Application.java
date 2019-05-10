package com.roro.msgatewayzuulexception6063;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZuulException6063Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulException6063Application.class, args);
    }

}
