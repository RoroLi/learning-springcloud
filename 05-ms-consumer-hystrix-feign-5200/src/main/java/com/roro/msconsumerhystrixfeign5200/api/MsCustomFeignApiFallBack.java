package com.roro.msconsumerhystrixfeign5200.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**降级方法 */
@Component
@Slf4j
public class MsCustomFeignApiFallBack implements MsCustomFeignApi{
    /**注意实现 */

    @Override
    public String call(String userId) {
        System.err.println("调用了降级call");
        return "调用了降级call:"+userId;
    }

    @Override
    public String callNoFallBack(String userId) {
        System.err.println("调用了降级callNoFallBack");
        return "调用了降级callNoFallBack:"+userId;
    }
}
