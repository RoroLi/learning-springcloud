package com.roro.springcloudprovidersimple3200.controller;

import com.roro.springcloudprovidersimple3200.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/say/{words}")
    public String  say(@PathVariable("words") String words) {
        return words+":"+simpleService.getName();
    }
}
