package com.xworkz.diary.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DiaryInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{DairyConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/name","/hospital","/rto","/policeStation"};
    }
}
