package com.example.week6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.week6")
@PropertySource("application.properties")
public class SpringConfiguration {
}
