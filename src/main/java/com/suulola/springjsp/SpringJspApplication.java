package com.suulola.springjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// extends SpringBootServletInitializer
@SpringBootApplication
public class SpringJspApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // return super.configure(builder);
        return builder.sources(SpringJspApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringJspApplication.class, args);
    }

}
