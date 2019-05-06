package com.roro.springcloudconsumerfeign3700.api;

import com.roro.springcloudconsumerfeign3700.config.MsProvider8007CustomCfg;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import java.util.List;


@FeignClient(name = "springcloud-consumer-feign-3700",configuration = MsProvider8007CustomCfg.class,path = "/hello")
public interface MsCustomFeignApi {

    @RequestLine("GET /hello")
    public String getName();

//    @RequestLine("GET /queryOrdersByUserId/{userId}")
//    public String getName(@Param("userId") Integer userId);
}
