package org.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

=======
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
>>>>>>> 452fa9e47a16efd3c1ad86df13085533a516ba78


@SpringBootApplication
@EnableZuulProxy
public class DoubleGatewayApplication {

<<<<<<< HEAD

=======
>>>>>>> 452fa9e47a16efd3c1ad86df13085533a516ba78
    public static void main(String[] args) {
        SpringApplication.run(DoubleGatewayApplication.class, args);
    }
}
