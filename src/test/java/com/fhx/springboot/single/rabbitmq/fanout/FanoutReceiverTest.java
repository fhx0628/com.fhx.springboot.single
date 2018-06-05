package com.fhx.springboot.single.rabbitmq.fanout;

import com.fhx.springboot.single.SingleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SingleApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class FanoutReceiverTest {
    @Autowired
    private FanoutSender fanoutSender;

    @Test
    public void provider_fanout_msg () throws InterruptedException{
        int i = 0;
        while (true) {
            i++;
            Thread.sleep(1000);
            this.fanoutSender.send("well, you got fanout " + i + "st message!");
        }
    }
}
