package com.roro.mscfgserverbus7400.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RibbitMqCfg {

    /**
     * 主题交换机
     * @return
     */
    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("auto-refresh",true,false);
    }

    @Bean
    public Queue autoRefreshCfgQueue() {
        return new Queue("auto-refresh-cfg-queue",true);
    }

    @Bean
    public Binding autoRefreshCfgBinding() {
        return BindingBuilder.bind(autoRefreshCfgQueue()).to(topicExchange()).with("auto-cfg");
    }
}
