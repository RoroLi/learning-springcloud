package com.roro.springcloudconsumerfeign3800.controller;

import com.roro.springcloudconsumerfeign3800.feign.FeignClientTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Autowired
    FeignClientTest feignClientTest;

    //@RequestMapping(value = "index",method = RequestMethod.GET)
    @RequestMapping(value = "index")
    public String index(){
        return feignClientTest.getName();
    }

    @RequestMapping("/say/{words}")
    public String findUserById(@PathVariable String words) {
        System.out.println(words);
        System.out.println(words);
        System.out.println(words);
        return feignClientTest.say(words);
    }
}
