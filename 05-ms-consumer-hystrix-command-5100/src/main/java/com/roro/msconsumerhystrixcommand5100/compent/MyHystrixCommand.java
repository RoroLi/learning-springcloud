package com.roro.msconsumerhystrixcommand5100.compent;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MyHystrixCommand extends HystrixCommand<String> {

    private String words;

    private RestTemplate restTemplate;

    @Override
    protected String run() throws Exception {
        ResponseEntity  response  =  restTemplate.getForEntity("http://05-MS-PROVIDER-SIMPLE/say1/"+words, String.class);
        return response.getBody().toString();
    }

    /**
     * 降级方法(回退)
     * @return
     */
    @Override
    protected String getFallback() {
        log.info("触发降级方法========================>");
        return "触发降级方法";
    }

    //构造方法
    public MyHystrixCommand(String commandGroupKey, RestTemplate restTemplate, String words) {
        super(HystrixCommandGroupKey.Factory.asKey(commandGroupKey));
        this.restTemplate = restTemplate;
        this.words = words;
    }
}
