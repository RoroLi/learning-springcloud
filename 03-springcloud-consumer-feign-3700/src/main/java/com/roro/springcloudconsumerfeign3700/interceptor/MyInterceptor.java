package com.roro.springcloudconsumerfeign3700.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class MyInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        System.out.println("自定义拦截器");
        //template.header("token","123456");
    }
}
