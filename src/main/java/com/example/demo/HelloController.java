package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liux on 2017/8/11.
 */
@RestController
public class HelloController extends ServletInitializer {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello,Spring Boot";
    }
}