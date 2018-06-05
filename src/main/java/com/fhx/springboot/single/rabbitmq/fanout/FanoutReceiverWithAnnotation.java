package com.fhx.springboot.single.rabbitmq.fanout;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(name = "fanout.msg.annotation", autoDelete = "true"),
        exchange = @Exchange(name = "fanout.exchange", type = ExchangeTypes.FANOUT)))
public class FanoutReceiverWithAnnotation {
    @RabbitHandler
    public void process (String msg) {
        System.out.println("fanout receiver get message with annotation is " + msg);
    }
}
