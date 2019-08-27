package com.minichn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by minichn on 2019/8/27 0027.
 */
@SpringBootApplication
@EnableConfigServer
public class RemoteConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RemoteConfigServerApplication.class,args);
    }
}
