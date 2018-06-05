package com.fhx.springboot.single.rabbitmq.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate topicTemplate;

    public void send (String msg) {
        this.topicTemplate.convertAndSend("fanout.exchange","",msg);
    }
}
