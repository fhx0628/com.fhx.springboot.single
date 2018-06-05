package com.fhx.springboot.single.rabbitmq.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.msg")
public class FanoutReceiver {
    @RabbitHandler
    public void process (String msg) {
        System.out.println("fanout message is " + msg);
    }
}
