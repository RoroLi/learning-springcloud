package com.roro.msribbonquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RibbonQuickStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonQuickStartApplication.class, args);
        System.out.println("不要在意03-ms-ribbon-quiickstart是否能启动");
        System.out.println("本模块演示了如何引入ribbon");
        System.out.println("ribbon是客户端负载均衡跟eureka-client配合使用的");
        System.out.println("三板斧");
        System.out.println("一、依赖spring-cloud-starter-netflix-ribbon");
        System.out.println("二、com.roro.msribbonquickstart.config.MainConfig以及 @LoadBalanced");
        System.out.println("三、application.properties");

        //System.out.println("不要怀疑，其实我们在01、02模块系列以及用到了Ribbon");
    }

}
