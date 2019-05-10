package com.roro.msproviderorderautorefreshbus7500;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderOrderautorefreshbus7500Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderOrderautorefreshbus7500Application.class, args);
    }

}
