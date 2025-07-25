package com.xworkz.in.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.in")
public class SpringConfig {
    public SpringConfig()
    {
        System.out.println("running SpringConfig constructor");
    }

}
