package com.bintang.belajar.spring.dasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.bintang.belajar.spring.dasar.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "com.bintang.belajar.spring.dasar.repository",
    "com.bintang.belajar.spring.dasar.service",
    "com.bintang.belajar.spring.dasar.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
