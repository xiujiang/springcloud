package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by joel on 2017/12/16.
 * main
 */
@SpringBootApplication
@EnableEurekaClient
public class SimpleProviderUserApplication extends SpringBootServletInitializer {
//public class SimpleProviderUserApplication{
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources(SimpleProviderUserApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SimpleProviderUserApplication.class,args);
    }}
