package com.roro.msconsumerhystrixfeign5200.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(name = "05-MS-PROVIDER-SIMPLE",fallback =MsCustomFeignApiFallBack.class ,path = "/order")
@FeignClient(name = "05-MS-PROVIDER-SIMPLE",fallback =MsCustomFeignApiFallBack.class)
public interface MsCustomFeignApi {

    @RequestMapping("/call/{userId}")
    public String call(@PathVariable("userId") String userId);

    @RequestMapping("/callNoFallBack/{userId}")
    public String callNoFallBack(@PathVariable("userId") String userId);

}
