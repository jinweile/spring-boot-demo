package com.example.myproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityView;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

import java.util.Properties;

/**
 * Created by jinweile on 2015/6/26.
 */
@Configuration
public class MvcConifg extends WebMvcConfigurationSupport {

    @Autowired
    private Environment env;

    @Bean
    public ViewResolver viewResolver() {
        System.out.println("---------------------env" + env.getProperty("jdbc.driverClass"));

        VelocityViewResolver viewResolver = new VelocityViewResolver();
        viewResolver.setViewClass(VelocityView.class);
        viewResolver.setCache(true);
        viewResolver.setPrefix("/");
        viewResolver.setSuffix(".html");
        viewResolver.setContentType("text/html;charset=UTF-8");
        viewResolver.setDateToolAttribute("dataTool");
        viewResolver.setNumberToolAttribute("numberTool");
        viewResolver.setExposeRequestAttributes(true);
        viewResolver.setExposeSessionAttributes(true);

        return viewResolver;
    }

    /*@Bean
    public VelocityConfigurer velocityConfigure(){
        VelocityConfigurer configure = new VelocityConfigurer();
        configure.setResourceLoaderPath("classpath:/velocity/");
        Properties prop = new Properties();
        prop.put("input.encoding", "UTF-8");
        prop.put("output.encoding", "UTF-8");
        configure.setVelocityProperties(prop);
        return configure;
    }*/

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/static/**").addResourceLocations("/WEB-INF/static/");
    }

}
