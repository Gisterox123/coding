package com.ppku.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Provider7001Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider7001Application.class, args);
    }

}
