package com.roro.msconsumerhystrixfeign5200.controller;

import com.roro.msconsumerhystrixfeign5200.api.MsCustomFeignApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/user")
@Slf4j
public class HyxtrixFeignController {

    @Autowired
    private MsCustomFeignApi msCustomFeignApi;

    @RequestMapping("/call/{userId}")
    public String call(@PathVariable("userId") String userId) {
        System.err.println("调用远程服务call"+userId);
        String bak=msCustomFeignApi.call(userId);
        return bak;
    }

}
