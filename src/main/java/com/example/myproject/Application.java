package com.example.myproject;

import com.example.myproject.config.MvcConifg;
import com.example.myproject.config.TestConfig;
import org.springframework.boot.SpringApplication;

import java.util.HashSet;
import java.util.Set;


public class Application {

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{TestConfig.class}, args);

        //通过xml配置文件形式启动spring-boot
        /*SpringApplication app = new SpringApplication(TestConfig.class);
        app.setWebEnvironment(true);
        app.setShowBanner(false);
        Set<Object> set = new HashSet<Object>();
        set.add("classpath:applicationContext.xml");
        app.setSources(set);
        app.run(args);*/
    }

}