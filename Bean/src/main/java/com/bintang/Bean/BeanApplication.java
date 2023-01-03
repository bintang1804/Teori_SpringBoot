package com.bintang.Bean;

import java.util.function.Supplier;
import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static org.springframework.web.server.adapter.WebHttpHandlerBuilder.applicationContext;

@SpringBootApplication
public class BeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanApplication.class, args);


    }

}
