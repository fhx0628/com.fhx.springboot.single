package com.fhx.springboot.single.rabbitmq.direct;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(
        bindings = @QueueBinding(
        value = @Queue(value = "${rabbitmq.config.queue.direct.exchange.info.routing.name}",autoDelete = "true"),
        exchange = @Exchange(value = "${rabbitmq.config.queue.direct.exchange.name}", type = ExchangeTypes.DIRECT),
        key = "${rabbitmq.config.queue.direct.exchange.info.routing.key}"))
public class DirectReceiver {
    @RabbitHandler
    public void process (String msg) {
        System.out.println("Direct Msg get is " + msg);
    }
}
