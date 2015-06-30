package com.example.myproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.servlet.MultipartConfigElement;

/**
 * Created by jinweile on 2015/6/26.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.myproject.web","com.example.myproject.db"})
@PropertySource("classpath:resources.properties")
@EnableTransactionManagement
public class TestConfig {

    @Autowired
    private Environment env;

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("1Mb");
        factory.setMaxRequestSize("10Mb");
        return factory.createMultipartConfig();
    }

}
