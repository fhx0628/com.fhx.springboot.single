package com.fhx.springboot.single.rabbitmq.topic;

import com.fhx.springboot.single.SingleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SingleApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TopicReceiverTest {
    @Autowired
    private TopicSenderError topicSenderError;

    @Autowired
    private TopicSenderInfo topicSenderInfo;

    @Test
    public void provider_topic_msg () throws InterruptedException {
        int count = 0;
        while(true) {
            count++;
            Thread.sleep(1000);
            this.topicSenderError.send("this is " + count + "st error message!");
            this.topicSenderInfo.send("this is " + count + "st info message!");
        }
    }
}
