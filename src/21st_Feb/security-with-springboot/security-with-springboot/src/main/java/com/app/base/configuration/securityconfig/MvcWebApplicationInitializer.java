package com.app.base.configuration.securityconfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.app.base.configuration.securityconfig.WebSecurityConfig;

/**
 * Step 3
 * Now, load WebSecurityConfig in our existing ApplicationInitializer and add into the getRootConfigClasses() method.
 *  WebSecurityConfig  ApplicationInitializer  getRootConfigClasses () 
 */
@SuppressWarnings("unused")
public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { WebSecurityConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}

