package com.fhx.springboot.single.rabbitmq.helloworld;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldSender {
    @Autowired
    private AmqpTemplate helloWorldTemplate;

    @Value("${rabbitmq.config.queue.direct.exchange.name}")
    private String exchangeName;

    @Value("${rabbitmq.config.queue.direct.exchange.info.routing.key}")
    private String routeKey;

    public void send(String msg) {
        helloWorldTemplate.convertAndSend("hello world", msg);
    }

    public void sendDirectQueue() {
        helloWorldTemplate.convertAndSend(this.exchangeName, this.routeKey, "Direct Queue test");
    }
}
