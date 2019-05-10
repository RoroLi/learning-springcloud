package com.roro.msproviderorder7300.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
@Slf4j
@RefreshScope
public class OrderController {

    @Autowired
    private ServiceInstance serviceInstance;

    @Value("${busi.ops}")
    private String isNewLogic;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getRegisterInfo")
    public String info() {
        return serviceInstance.getHost()+":"+serviceInstance.getPort();
    }

    /**
     * 测试手动刷新
     * @return
     */
    @RequestMapping("/testManualRefresh")
    public String testManualRefresh() {
        if(isNewLogic.equals("Y")) {
            System.out.println("走新逻辑................");
        }else {
            System.out.println("走老的业务逻辑...........");
        }
        return isNewLogic;
    }

}
