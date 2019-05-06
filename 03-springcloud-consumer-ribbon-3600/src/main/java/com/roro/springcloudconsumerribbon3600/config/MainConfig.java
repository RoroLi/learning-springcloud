package com.roro.springcloudconsumerribbon3600.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MainConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    /**
     * 随机算法的负载均衡
     * 默认是轮询算法
     * @return
     */
    //@Bean
    public IRule myRule() {
        //RandomRule  随机选择一个Server
        //RetryRule  对选定的负载均衡策略机上重试机制，在一个配置时间段内当选择Server不成功，则一直尝试使用subRule的方式选择一个可用的server
        //RoundRobinRule  轮询选择， 轮询index，选择index对应位置的Server
        //AvailabilityFilteringRule  过滤掉一直连接失败的被标记为circuit tripped的后端Server，并过滤掉那些高并发的后端Server或者使用一个AvailabilityPredicate来包含过滤server的逻辑，其实就就是检查status里记录的各个Server的运行状态
        //BestAvailableRule  选择一个最小的并发请求的Server，逐个考察Server，如果Server被tripped了，则跳过。
        //WeightedResponseTimeRule  根据响应时间加权，响应时间越长，权重越小，被选中的可能性越低；
        //ZoneAvoidanceRule  复合判断Server所在区域的性能和Server的可用性选择Server
        //或者自定义自己的负载均衡策略 MyRandomRule
        return new RandomRule();
    }

}
