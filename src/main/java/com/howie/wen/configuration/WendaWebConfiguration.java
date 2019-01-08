package com.howie.wen.configuration;

import com.howie.wen.interceptor.LoginRequiredInterceptor;
import com.howie.wen.interceptor.PassportInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author:HowieLee
 * @Date:1/8/2019
 * @Description:com.howie.wen.configuration
 * @version:1.0
 */
@Component
public class WendaWebConfiguration extends WebMvcConfigurerAdapter {

    @Autowired(required=false)
    @Qualifier("passportInterceptor")
    PassportInterceptor passportInterceptor;

    @Autowired(required=false)
    @Qualifier("loginRequiredInterceptor")
    LoginRequiredInterceptor loginRequiredInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(passportInterceptor);
        registry.addInterceptor(loginRequiredInterceptor).addPathPatterns("/user/*");
        super.addInterceptors(registry);
    }
}
