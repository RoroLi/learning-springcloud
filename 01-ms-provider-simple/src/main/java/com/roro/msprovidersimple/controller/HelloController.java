package com.roro.msprovidersimple.controller;

//import com.netflix.discovery.DiscoveryClient;
import com.roro.msprovidersimple.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {

    @Autowired
    SimpleService simpleService;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String index(){
       return "HelloWord:"+simpleService.getName();
    }

}
