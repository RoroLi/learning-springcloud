package com.roro.springcloudconsumerfeign3800.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "springcloud-provider-simple")
public interface FeignClientTest {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String getName();//无参

    @RequestMapping(value = "/say/{words}", method = RequestMethod.GET)
    public String say(@PathVariable("words") String words);

}
