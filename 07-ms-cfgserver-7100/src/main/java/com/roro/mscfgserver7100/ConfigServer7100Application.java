package com.roro.mscfgserver7100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer7100Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer7100Application.class, args);
        System.err.println("本模块演示了Spring Cloud Server ");
        System.err.println("一、依赖 ");
        System.err.println("二、注解 ");
        System.err.println("三、application.yml ");

        System.err.println("启动访问");
        System.err.println("http://localhost:7100/application-test.yml");

        //通过application-{profiles}.yml来访问
        //      http://localhost:9100/application-test.yml
        //      http://localhost:9100/application-prod.yml
        //通过/application/{profiles}/{lable}
        //      http://localhost:9100/application/test/master
        //      http://localhost:9100/application/prod/master
        //通过/lable/application-{profiles}.yml
        //      http://localhost:9100/master/application-prod.yml
        //      http://localhost:9100/master/application-test.yml

    }
}
