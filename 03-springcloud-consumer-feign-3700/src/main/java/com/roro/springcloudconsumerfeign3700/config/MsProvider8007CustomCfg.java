package com.roro.springcloudconsumerfeign3700.config;

import com.roro.springcloudconsumerfeign3700.interceptor.MyInterceptor;
import feign.Contract;
import feign.Logger;
import feign.Request;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

public class MsProvider8007CustomCfg {

    @Bean
    public Contract feignContract() {
        return new Contract.Default();
    }

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Request.Options feignRequestOptions() {
        return new Request.Options(30000, 30000);
    }

    @Bean
    public RequestInterceptor myInterceptor() {
        return new MyInterceptor();
    }
}
