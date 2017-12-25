package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by joel on 2017/12/19.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication extends SpringBootServletInitializer {
//public class EurekaApplication{
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
        return springApplicationBuilder.sources(EurekaApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
