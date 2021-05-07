package com.ppku.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Server6001Application {

    public static void main(String[] args) {
        SpringApplication.run(Server6001Application.class, args);
    }

}
