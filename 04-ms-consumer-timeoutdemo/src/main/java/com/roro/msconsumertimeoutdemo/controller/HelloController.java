package com.roro.msconsumertimeoutdemo.controller;

import com.roro.msconsumertimeoutdemo.exception.MyTimeoutException;
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
        String bak="";
        try {
            bak=restTemplate.getForEntity("http://localhost:4100/hello",String.class).getBody();
        }catch (Exception e) {
            throw new MyTimeoutException(0,"调用超时");
        }
       return bak;
    }

}
