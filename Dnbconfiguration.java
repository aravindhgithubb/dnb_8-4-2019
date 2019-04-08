package com.dnb.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan
public class Dnbconfiguration implements WebMvcConfigurer {
	 @Override
	    public void configureViewResolvers(ViewResolverRegistry registry) {
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setViewClass(JstlView.class);
	        resolver.setPrefix("/WEB-INF/jsp/");
	        resolver.setSuffix(".jsp");
	        resolver.setContentType("application/html");

	        registry.viewResolver(resolver);
	    }

	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }
}