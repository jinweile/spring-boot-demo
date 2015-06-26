package com.example.myproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by jinweile on 2015/6/26.
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.myproject.web","com.example.myproject.db"})
@PropertySource("classpath:resources.properties")
@EnableTransactionManagement
public class TestConfig {

    @Autowired
    private Environment env;

}
