package com.fhx.springboot.single;

import com.fhx.springboot.single.myservlet.MyServlet;
import com.fhx.springboot.single.myservlet.MyServlet2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingleApplication {
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new MyServlet(), "/xs/*");// ServletName默认值为首字母小写，即myServlet
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean2() {
        return new ServletRegistrationBean(new MyServlet2(), "/xs2/*");// ServletName默认值为首字母小写，即myServlet
    }

    public static void main(String[] args) {
        SpringApplication.run(SingleApplication.class, args);
    }
}
