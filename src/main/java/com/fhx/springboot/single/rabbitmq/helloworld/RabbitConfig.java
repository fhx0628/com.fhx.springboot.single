package com.fhx.springboot.single.rabbitmq.helloworld;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello world");
    }

    @Bean
    public Queue byeQueue() {
        return new Queue("bye world");
    }
}
