package com.fhx.springboot.single.rabbitmq.topic;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(name = "topic.queue.log",autoDelete = "true"),
        exchange = @Exchange(value = "topic.exchange",type = ExchangeTypes.TOPIC),
        key = "topic.queue.*.log"))
public class TopicReceiver {
    @RabbitHandler
    public void process (String msg) {
        System.out.println("topic.queue.*.log get message is " + msg);
    }
}
