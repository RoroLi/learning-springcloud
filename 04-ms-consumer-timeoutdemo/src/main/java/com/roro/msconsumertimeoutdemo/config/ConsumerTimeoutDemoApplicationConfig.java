package com.roro.msconsumertimeoutdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerTimeoutDemoApplicationConfig {

    @Bean
    public RestTemplate restTemplate() {
        //设置restTemplate的超时时间
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setReadTimeout(2000);
        requestFactory.setConnectTimeout(2000);

        RestTemplate restTemplate = new RestTemplate(requestFactory);
        return restTemplate;
    }
}
