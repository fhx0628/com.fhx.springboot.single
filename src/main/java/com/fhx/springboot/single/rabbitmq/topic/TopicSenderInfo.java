package com.fhx.springboot.single.rabbitmq.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSenderInfo {
    @Autowired
    private AmqpTemplate fanoutTemplate;

    public void send (String msg) {
        this.fanoutTemplate.convertAndSend("topic.exchange","topic.queue.info.log",msg);
    }
}
