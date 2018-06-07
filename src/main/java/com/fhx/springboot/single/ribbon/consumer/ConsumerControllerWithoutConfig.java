package com.fhx.springboot.single.ribbon.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerControllerWithoutConfig {

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("/provider-service/no-config/port")
    public String getProviderServicePortWithoutConifg () {
        RestTemplate restTemplate = new RestTemplate();
        ServiceInstance providerServiceInstance = loadBalancerClient.choose("EUREKA.PROVIDER"); //host name case sensitive
        ParameterizedTypeReference<String> typeReference = new ParameterizedTypeReference<String>() {};
        ResponseEntity<String> responseEntity = restTemplate.exchange("http://" + providerServiceInstance.getHost() + ":" + providerServiceInstance.getPort() + "/port", HttpMethod.GET, null,typeReference);
        return responseEntity.getBody();
    }

}
