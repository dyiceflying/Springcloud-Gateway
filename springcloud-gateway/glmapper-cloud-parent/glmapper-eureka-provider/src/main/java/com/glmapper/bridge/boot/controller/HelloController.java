package com.glmapper.bridge.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String hostname;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Glmapper! Now Port is "+port +" And hostname is " +hostname;
    }
}
