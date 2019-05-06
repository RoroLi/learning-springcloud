package com.roro.msproviderdemo.controller;

import com.roro.msproviderdemo.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    SimpleService simpleService;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String index(){
       return "HelloWord:"+simpleService.getName();
    }

}
