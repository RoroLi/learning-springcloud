package com.roro.msconsumerhystrixfeign5200.cfg;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**关闭feign对hystrix的支持 */
public class MsCustomeFeignApiWithoutHystrixConfg {
    @Scope("prototype")
    @Bean
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
