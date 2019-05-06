package com.roro.msprovidertimeoutdemo.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleServiceImpl implements SimpleService{

    @Override
    public String getName() {
        try {
            Thread.sleep(2001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "泰勒3200";
    }
}
