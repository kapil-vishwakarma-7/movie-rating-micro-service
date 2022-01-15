package io.spring.moviecatelogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieCatelogServiceApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestController() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(MovieCatelogServiceApplication.class, args);
	}

}
