package com.xworkz.register;

import com.xworkz.internal.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.register")
public class SpringRegister {
    public SpringRegister()
    {
        System.out.println("SpringConfiguration constructor");
    }

    @Bean
    public String getName()
    {
        System.out.println("getName String1 method");
        return "sam";
    }

    @Bean
    public String getCollegeName()
    {
        System.out.println("getCollegeName String2 method");
        return "Kvg";
    }

    @Bean
    public String getProgramLang()
    {
        System.out.println("getProgramLang String3 method");
        return "Java";
    }

    @Bean
    public String getCatName()
    {
        System.out.println("getCatName String4 method");
        return "jamm";
    }

    @Bean
    public String getTreeName()
    {
        System.out.println("getTreeName String5 method");
        return "mango";
    }

    @Bean
    public Laptop getLaptop1()
    {
        System.out.println("Laptop1 method");
        return new Laptop("hp",58000);
    }

    @Bean
    public Laptop getLaptop2()
    {
        System.out.println("Laptop2 method");
        return new Laptop("lenova",68000);
    }

    @Bean
    public Laptop getLaptop3()
    {
        System.out.println("Laptop3 method");
        return new Laptop("asus",78000);
    }

    @Bean
    public Laptop getLaptop4()
    {
        System.out.println("Laptop4 method");
        return new Laptop("dell",88000);
    }

    @Bean
    public Laptop getLaptop5()
    {
        System.out.println("Laptop5 method");
        return new Laptop("lg",230000);
    }

    @Bean
    public Byte byte1() {
        System.out.println("Byte1 method");
        return 10;
    }
    @Bean
    public Byte byte2() {
        System.out.println("Byte2 method");
        return 20;
    }

    @Bean
    public Short short1() {
        System.out.println("Short1 method");
        return 100;
    }
    @Bean
    public Short short2() {
        System.out.println("Short2 method");
        return 200;
    }

    @Bean
    public Integer int1() {
        System.out.println("integer1 method");
        return 1000;
    }
    @Bean
    public Integer int2() {
        System.out.println("integer2 method");
        return 2000;
    }

    @Bean
    public Long long1() {
        System.out.println("Long1 method");
        return 10000L;
    }
    @Bean
    public Long long2() {
        System.out.println("Long2 method");
        return 20000L;
    }

    @Bean
    public Float float1() {
        System.out.println("Float1 method");
        return 1.1f;
    }
    @Bean
    public Float float2() {
        System.out.println("float2 method");
        return 2.2f;
    }

    @Bean
    public Double double1() {
        System.out.println("double1 method");
        return 3.3;
    }
    @Bean
    public Double double2() {
        System.out.println("double2 method");
        return 4.4;
    }

    @Bean
    public Character char1() {
        System.out.println("character1 method");
        return 'A';
    }
    @Bean
    public Character char2() {
        System.out.println("Character2 method");
        return 'B';
    }

    @Bean
    public Boolean boolean1() {
        System.out.println("Boolean1 method");
        return true;
    }
    @Bean
    public Boolean boolean2() {
        System.out.println("Boolean2 method");
        return false;
    }

}