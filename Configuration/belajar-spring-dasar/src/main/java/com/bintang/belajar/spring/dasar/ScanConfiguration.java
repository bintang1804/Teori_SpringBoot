package com.bintang.belajar.spring.dasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.bintang.belajar.spring.dasar.configuration"
})
public class ScanConfiguration {
}
