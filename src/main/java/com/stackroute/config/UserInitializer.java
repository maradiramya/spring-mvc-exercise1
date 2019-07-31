package com.stackroute.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class UserInitializer extends AbstractAnnotationConfigDispatcherServletInitializer //this initializes spring dispatcher servlet and register with spring dispatcher servelet and creates the web application
{

    @Override
    protected Class<?>[] getRootConfigClasses() { //redirects to configuration class
        return new Class[]{UserConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; //used for mapping http request  to controller
    }
}
