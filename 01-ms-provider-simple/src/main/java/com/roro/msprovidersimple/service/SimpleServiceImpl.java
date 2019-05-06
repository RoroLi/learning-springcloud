package com.roro.msprovidersimple.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleServiceImpl implements SimpleService{

    @Override
    public String getName() {
        return "泰勒";
    }
}
