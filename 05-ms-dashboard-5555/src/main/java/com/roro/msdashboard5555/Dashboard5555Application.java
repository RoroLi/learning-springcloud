package com.roro.msdashboard5555;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Dashboard5555Application {

    public static void main(String[] args) {
        SpringApplication.run(Dashboard5555Application.class, args);
        System.out.println("本模块是为了监控hystrix的");
        System.out.println("依赖");
        System.out.println("@EnableHystrixDashboard");
        System.out.println("启动：访问http://localhost:5555/hystri");
        System.out.println("填写http://localhost:5200/hystrix.stream   2000毫秒 名字 点击monitor?stream");
        System.out.println("此时演示了Dashboard监控5200");
        System.out.println("但如何监控多个服务呢？turbian");
        System.out.println("");

    }

}
