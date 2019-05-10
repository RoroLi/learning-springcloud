package com.roro.msgatewayzuulcors6064;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZuulCors6064Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulCors6064Application.class, args);
    }

}
