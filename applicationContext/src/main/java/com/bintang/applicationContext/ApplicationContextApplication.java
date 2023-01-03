package com.bintang.applicationContext;

import org.junit.jupiter.api.Assertions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApplicationContextApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationContextApplication.class, args);
        
        ApplicationContext context
                = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        Assertions.assertNotNull(context);
    }

}
