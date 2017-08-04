package com.project.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.project.start.controller.TestController;

@SpringBootApplication
@ComponentScan(basePackageClasses = TestController.class)
public class SpringBootSeleniumHtmlunitdriverApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSeleniumHtmlunitdriverApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SpringBootSeleniumHtmlunitdriverApplication.class);
	}
}
