package com.roro.mscfgserverbus7400.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AutoRefreshController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/autoRefresh")
    public Object autoRefresh() {
        Map<String,Object> sendMap = new HashMap<String,Object>();
        sendMap.put("isNew","Y");
        rabbitTemplate.convertAndSend("auto.refresh.topic","auto.refresh.all", JSON.toJSONString(sendMap));
        return "OK";
    }
}
