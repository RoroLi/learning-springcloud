package com.roro.msgatewayzull6060;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZull6060Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZull6060Application.class, args);
        System.err.println("启动注册中心");
        System.err.println("启动06-ms-provider-simple1-6010");
        System.err.println("启动本模块");
        System.err.println("访问：http://127.0.0.1:6060/06-ms-provider-simple-1/phone/get/泰勒");
        System.err.println("http://127.0.0.1:6060/微服务名字/phone/get/泰勒");
        System.err.println("如果这样用会对外暴露了微服务名字");
        System.err.println("增加一个配置#指定微服务名称和路径的映射");
        System.err.println("zuul.routes.06-ms-provider-simple-1=/phoneService/**");
        System.err.println("这样就可以访问了http://127.0.0.1:6060/phoneService/phone/get/泰勒");
        System.err.println("但这样访问http://127.0.0.1:6060/06-ms-provider-simple-1/phone/get/泰勒  还是可以的");
        System.err.println("如果想禁止掉，请修改配置");
        System.err.println("#表示关闭所有通过微服务名称来映射访问\n" +
                "zuul.ignored-services=*");
        System.err.println("#关闭某个微服务的服务实例名称映射,若想关闭多个通过逗号隔开\n" +
                "zuul.ignored-services=06-ms-provider-simple-1");


    }

}
