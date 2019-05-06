package com.roro.springcloudconsumerfeign3700.controller;

import com.roro.springcloudconsumerfeignapi.api.HelloSerivceApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/HelloController")
@Slf4j
public class HelloController {

//    @Autowired
//    private MsCustomFeignApi msCustomFeignApi;

    @Autowired
    private HelloSerivceApi helloSerivceApi;

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        System.out.println("HelloController.index");
        return helloSerivceApi.getName();
    }

}
