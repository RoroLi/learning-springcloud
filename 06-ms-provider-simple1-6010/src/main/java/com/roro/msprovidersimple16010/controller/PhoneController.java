package com.roro.msprovidersimple16010.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phone")
public class PhoneController {

    @RequestMapping("/get/{name}")
    public String  get(@PathVariable("name") String name) {
        return name+"的phone：131412345";
    }

}
