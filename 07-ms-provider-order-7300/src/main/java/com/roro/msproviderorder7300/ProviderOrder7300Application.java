package com.roro.msproviderorder7300;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderOrder7300Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderOrder7300Application.class, args);
        System.err.println("启动");
        System.err.println("http://localhost:7300/order/testManualRefresh");
        System.err.println("修改githttps://github.com/RoroLi/git-cloud-config/blob/master/ms-provider-order.yml里ops的值");
        System.err.println("用postman 方式  post 请求 http://localhost:7300/actuator/refresh");
        System.err.println("http://localhost:7300/order/testManualRefresh");
        System.err.println("发现实现了不停机动态更新配置");
        System.err.println("但这样只是实现了一台机器，如果是集群，总不能一台台的刷吧");
        System.err.println("所以引入了bus");

    }
    @Bean
    public RestTemplate restTemplate() {
        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        simpleClientHttpRequestFactory.setConnectTimeout(5000);
        simpleClientHttpRequestFactory.setReadTimeout(5000);
        return new RestTemplate(simpleClientHttpRequestFactory);
    }
}
