package com.fhx.springboot.single.rabbitmq.helloworld;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component(value = "hello world receiver")
@RabbitListener(queues = "hello world")
public class HelloWorldReceiver {
    @RabbitHandler
    public void process (String msg) {
        System.out.println("receive message is " + msg);
    }
}
