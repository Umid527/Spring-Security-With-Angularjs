package org.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@EnableZuulProxy
public class DoubleGatewayApplication {


    public static void main(String[] args) {
        SpringApplication.run(DoubleGatewayApplication.class, args);
    }
}
