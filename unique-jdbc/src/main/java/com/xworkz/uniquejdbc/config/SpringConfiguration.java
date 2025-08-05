package com.xworkz.uniquejdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.uniquejdbc")
public class SpringConfiguration implements WebMvcConfigurer {
    public SpringConfiguration()
    {
        System.out.println("SpringConfiguration constructor");
    }



    @Bean
    public InternalResourceViewResolver internalResourceViewResolver()
    {
        System.out.println("InternalResourceViewResolver method");
        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
        return internalResourceViewResolver;
    }
}