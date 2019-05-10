package com.roro.msgatewayzullfilter6061;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZullFilter6061Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZullFilter6061Application.class, args);
        System.err.println("知识点：");
        System.err.println("zuul过滤器详解");
        System.err.println("    1、Zuul过滤器类型与请求生命周期");
        System.err.println("        zuul过滤器的类型");
        System.err.println("             PRE：这种过滤器在请求被路由之前调用。我们可利用这种过滤器实现身份验证、在集群中选择请求的微服务、记录调试信息等");
        System.err.println("             ROUTING：这种过滤器将请求路由到微服务。这种过滤器用于构建发送给微服务的请求，并使用Apache HttpClient或Netfilx Ribbon请求微服务");
        System.err.println("             POST：这种过滤器在路由到微服务以后执行。这种过滤器可用来为响应添加标准的HTTP Header、收集统计信息和指标、将响应从微服务发送给客户端等");
        System.err.println("             ERROR：在其他阶段发生错误时执行该过器。除了默认的过滤器类型微服务");
        System.err.println("        先执行pre>routing>post 然后再在同类型的过滤器按照order大小执行，越小的越先被执行");
        System.err.println("        zuul生命周期");
        System.err.println("    2、如何编写Zuul过滤器");
        System.err.println("    3、如何禁用Zuul过滤器");
        System.err.println("        禁用系统的过滤器org.springframework.cloud.netflix.zuul.filters包下的");
        System.err.println("        禁用自定义的过滤器");
        System.err.println("-----------------------------");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");
        System.err.println("");


    }

}
