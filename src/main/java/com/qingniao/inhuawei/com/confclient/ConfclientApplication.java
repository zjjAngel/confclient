package com.qingniao.inhuawei.com.confclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfclientApplication.class, args);
    }

}
