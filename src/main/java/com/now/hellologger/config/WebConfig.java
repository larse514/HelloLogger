package com.now.hellologger.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Crayton on 8/22/16.
 */
@Configuration
@ComponentScan(basePackages = "com.now.*")
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

}
