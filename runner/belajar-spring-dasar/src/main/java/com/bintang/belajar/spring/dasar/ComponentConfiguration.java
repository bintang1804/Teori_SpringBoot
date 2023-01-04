package com.bintang.belajar.spring.dasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.bintang.belajar.spring.dasar.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "programmerzamannow.spring.core.repository",
    "programmerzamannow.spring.core.service",
    "programmerzamannow.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
