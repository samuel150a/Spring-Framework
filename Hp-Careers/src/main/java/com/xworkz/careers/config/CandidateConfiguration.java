package com.xworkz.careers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.careers")
public class CandidateConfiguration {
    public CandidateConfiguration()
    {
        System.out.println("Running in the CandidateInitializer constructor ");
    }

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver()
    {
        System.out.println("Running in the internalResourceViewResolver method");

        InternalResourceViewResolver internalResourceViewResolver =new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }

    @Bean
    public MultipartResolver multipartResolver()
    {
        System.out.println("Running in the MultipartResolver method");
        return new StandardServletMultipartResolver();
    }
}
