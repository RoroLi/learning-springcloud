package com.roro.msconsumerhystrixcommand5100.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.roro.msconsumerhystrixcommand5100.compent.MyHystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("")
@Slf4j
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过hystrix命令模式 来进行调用
     * @param words
     */
     @RequestMapping("/say1/{words}")
     public String say1(@PathVariable("words") String words) {
        //构建调用命令模式
        MyHystrixCommand myHystrixCommand = new MyHystrixCommand("serviceGroupKey",restTemplate,words);
        String bak =myHystrixCommand.execute();
        return bak;
     }



    /**
     * 通过命令来指定降级方法
     * @param words
     * @return
     */

    @HystrixCommand(fallbackMethod ="say2FallBack")
    @RequestMapping("/say2/{words}")
    public String say2(@PathVariable("words") String words) {
        log.info("进入queryUserInfo..............");
        System.err.println("say2 正常调用，但调用会超时");
        ResponseEntity responseEntity  =  restTemplate.getForEntity("http://05-MS-PROVIDER-SIMPLE/say2/"+words, String.class);
        return responseEntity.getBody().toString();
    }

    protected String say2FallBack(String  words) {
        System.err.println("say2 降级方法");
        return "超时触发降级方法";
    }

    /**
     * 通过命令来指定降级方法
     * @param words
     * @return
     */

    @HystrixCommand(fallbackMethod ="say3FallBack")
    @RequestMapping("/say3/{words}")
    public String say3(@PathVariable("words") String words) {
        log.info("进入queryUserInfo..............");
        System.err.println("say3 正常调用，但调用服务毕抛异常");
        ResponseEntity responseEntity  =  restTemplate.getForEntity("http://05-MS-PROVIDER-SIMPLE/say3/"+words, String.class);
        return responseEntity.getBody().toString();
    }

    protected String say3FallBack(String  words) {
        System.err.println("say3 降级方法");
        return "服务异常触发降级方法";
    }

}
