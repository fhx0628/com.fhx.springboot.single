package com.fhx.springboot.single.rabbitmq.fanout;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutConfig {
    @Bean(name = "fanout.config.queue")
    public Queue queue () {
        return new Queue("fanout.msg");
    }

    @Bean
    FanoutExchange exchange () {
        return new FanoutExchange("fanout.exchange");
    }

    @Bean
    public Binding bindingExchangeChannel (@Qualifier("fanout.config.queue") Queue queue, FanoutExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange);
    }
}
