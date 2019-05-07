package com.roro.msconsumerhystrixfeign5200.api;

import com.roro.msconsumerhystrixfeign5200.cfg.MsCustomeFeignApiWithoutHystrixConfg;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "05-MS-PROVIDER-SIMPLE",configuration = MsCustomeFeignApiWithoutHystrixConfg.class,fallback =MsCustomFeignApiFallBack.class)

public interface MsCustomeFeignApiWithoutHystrix  {



    @RequestMapping("/callWithoutHystrx1/{userId}")
    //注意定义了MsCustomeFeignApiWithoutHystrixConfg类，局部关闭服务降级
    public String call(@PathVariable("userId") String userId);


}
