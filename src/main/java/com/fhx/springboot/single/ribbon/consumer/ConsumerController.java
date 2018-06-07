package com.fhx.springboot.single.ribbon.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @LoadBalanced
    @Bean
    RestTemplate constructRestTemplate () {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/provider-service/port")
    public String getProviderServicePort () {
        return this.restTemplate.getForObject("http://EUREKA.PROVIDER/port", String.class);
    }

}
