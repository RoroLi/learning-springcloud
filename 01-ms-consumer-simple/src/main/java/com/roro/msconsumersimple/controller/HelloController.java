package com.roro.msconsumersimple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String index(){
       return restTemplate.getForEntity("http://MS-PROVIDER-SIMPLE/hello",String.class).getBody();
    }

}
