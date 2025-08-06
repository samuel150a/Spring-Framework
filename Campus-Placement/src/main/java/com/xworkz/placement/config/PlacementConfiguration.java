package com.xworkz.placement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.placement")
public class PlacementConfiguration implements WebMvcConfigurer {

    public PlacementConfiguration() {
        System.out.println("PlacementConfiguration constructor");
    }


    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        return resolver;
    }



    @Bean
    public MultipartResolver multipartResolver() {
        System.out.println("MultipartResolver method");
        return new StandardServletMultipartResolver();
    }
}
