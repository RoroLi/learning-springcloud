package com.roro.springcloudprovidersimple3100.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleServiceImpl implements SimpleService{

    @Override
    public String getName() {
        return "泰勒3100";
    }
}
