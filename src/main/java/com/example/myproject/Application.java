package com.example.myproject;

import com.example.myproject.config.MvcConifg;
import com.example.myproject.config.TestConfig;
import org.springframework.boot.SpringApplication;


public class Application {

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{TestConfig.class}, args);
    }

}