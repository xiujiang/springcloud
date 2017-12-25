package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by joel on 2017/12/17.
 */
@SpringBootApplication
@EnableEurekaClient
public class SimpleCustomerUserApplication extends SpringBootServletInitializer {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
       protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
        return springApplicationBuilder.sources(SimpleCustomerUserApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SimpleCustomerUserApplication.class,args);
    }


}
