package com.creatunion.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class SimpleDemo {

    private int count = 0;

    @RequestMapping("a")
    public void logReq(String s) {
        System.out.println( s + count++);
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleDemo.class);
    }
}
