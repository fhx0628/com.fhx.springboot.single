package com.fhx.springboot.single.rabbitmq.direct;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DirectSender {
    @Autowired
    private AmqpTemplate directTemplate;

    @Value("${rabbitmq.config.queue.direct.exchange.name}")
    private String exchangeName;

    @Value("${rabbitmq.config.queue.direct.exchange.info.routing.key}")
    private String routeKey;

    public void sendDirectQueue() {
        directTemplate.convertAndSend(this.exchangeName, this.routeKey, "Direct Queue test");
    }
}
