package org.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class DoubleGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoubleGatewayApplication.class, args);
    }
}
