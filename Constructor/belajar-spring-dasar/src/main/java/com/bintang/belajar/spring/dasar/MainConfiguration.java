package com.bintang.belajar.spring.dasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.bintang.belajar.spring.dasar.configuration.BarConfiguration;
import com.bintang.belajar.spring.dasar.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
