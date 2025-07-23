package com.xworkz.diary.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.diary")
public class DairyConfiguration {
    public DairyConfiguration ()
    {
        System.out.println("Dairy config running");
    }
}
