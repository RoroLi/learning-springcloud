package com.roro.mscfgserverbus7400;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerBus7400Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBus7400Application.class, args);
        System.err.println("本模块演示ConfigServer+Bus服务总线");
        System.err.println("添加依赖");
        System.err.println("spring-cloud-starter-bus-amqp");
        System.err.println("spring-boot-starter-actuator");

        System.err.println("修改applicati.yml增加rabbit配置");

        System.err.println("启动访问");
        System.err.println("http://localhost:7400/application-test.yml");

        System.err.println("如果配置参数有更新");
        System.err.println("http://localhost:7400/bus/refresh");


        System.err.println("附加的，为了说了bus是什么东西");
        System.err.println("本模块增加了RibbitMqCfg和AutoRefreshController");
        System.err.println("以及07-ms-provider-order-autorefresh-7500模块增加了AutoRefresh");
        System.err.println("来说明bus原理");

        //http://localhost:7400/autoRefresh
        //http://192.168.77.128:15672/#/queues
    }

}
