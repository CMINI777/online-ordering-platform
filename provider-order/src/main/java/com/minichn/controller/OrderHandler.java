package com.minichn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by minichn on 2019/8/22 0022.
 */
@RestController
@RequestMapping("/order")
public class OrderHandler {
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "order的端口："+this.port;
    }
}
