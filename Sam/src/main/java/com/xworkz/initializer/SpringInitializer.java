package com.xworkz.initializer;

import com.xworkz.register.SpringRegister;
import com.xworkz.samuel.Configure;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("running in getRootConfigClasses ");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("running in getServletConfigClasses  ");
        return new Class[] { SpringRegister.class };

    }


    @Override
    protected String[] getServletMappings() {
        System.out.println("running in getServletMappings ");
        return new String[0];
    }
}
