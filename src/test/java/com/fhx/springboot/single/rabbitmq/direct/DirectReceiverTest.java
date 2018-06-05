package com.fhx.springboot.single.rabbitmq.direct;

import com.fhx.springboot.single.SingleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SingleApplication.class, webEnvironment =  SpringBootTest.WebEnvironment.DEFINED_PORT)
public class DirectReceiverTest {
    @Autowired
    private DirectSender directSender;

    @Test
    public void provider_direct_msg () throws InterruptedException{
        while(true) {
            Thread.sleep(1000);
            this.directSender.sendDirectQueue();
        }
    }
}
