package com.roro.msprovidersimple16010;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProviderSimple6010Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderSimple6010Application.class, args);
        System.out.println("本模块模拟一个phone微服务");
        System.out.println("启动后访问eureka看是否注册进去了");
        System.out.println("然后");
        System.out.println("访问：http://127.0.0.1:6010/phone/get/泰勒");
        System.out.println("看直接方法服务是否是通的");

    }

}
