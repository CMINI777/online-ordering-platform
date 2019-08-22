package com.minichn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by minichn on 2019/8/22 0022.
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterApplication.class,args);
    }
}
