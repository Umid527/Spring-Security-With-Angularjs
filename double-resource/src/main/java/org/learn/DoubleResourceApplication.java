package org.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;


@SpringBootApplication
public class DoubleResourceApplication {

//	@Bean
//	HeaderHttpSessionStrategy sessionStrategy() {
//		return new HeaderHttpSessionStrategy();
//	}

	public static void main(String[] args) {
		SpringApplication.run(DoubleResourceApplication.class, args);
	}
}
