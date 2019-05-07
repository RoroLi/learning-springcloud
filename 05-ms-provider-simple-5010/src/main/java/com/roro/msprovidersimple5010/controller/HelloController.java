package com.roro.msprovidersimple5010.controller;

import com.roro.msprovidersimple5010.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    SimpleService simpleService;

//    @RequestMapping(value = "hello",method = RequestMethod.GET)
//    public String index(){
//       return "HelloWord:"+simpleService.getName();
//    }

    @RequestMapping("/say1/{words}")
    public String  say1(@PathVariable("words") String words) {
        return "传来的words："+words+":"+simpleService.getName();
    }

    @RequestMapping("/say2/{words}")
    public String  say2(@PathVariable("words") String words) {
        return "传来的words："+words+":"+simpleService.getName();
    }

    @RequestMapping("/say3/{words}")
    public String  say3(@PathVariable("words") String words) {
        int i = 1/0;
        return "传来的words："+words+":"+simpleService.getName();
    }


    @RequestMapping("/call/{userId}")
    public String  call(@PathVariable("userId") String userId) {
        try {
            Thread.sleep(2001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "调用了服务器call："+userId;
    }

}
