package com.roro.springcloudconsumerfeignapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "ms-provider-order-feign",path = "")
public interface HelloSerivceApi {

     @RequestMapping("/hello")
     String getName();

//    @RequestMapping("/queryOrdersByUserId/{userId}")
//    List<OrderVo> queryOrdersByUserId(@PathVariable("userId") Integer userId);
//
//    @RequestMapping("/getRegisterInfo")
//    String info();
}
