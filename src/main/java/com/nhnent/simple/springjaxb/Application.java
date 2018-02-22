package com.nhnent.simple.springjaxb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by danielkim
 */
@SpringBootApplication
//@EnableAutoConfiguration
//@EnableWebMvc
//@ComponentScan
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
