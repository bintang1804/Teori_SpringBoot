package com.bintang.belajar.spring.dasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.bintang.belajar.spring.dasar.service.MerchantServiceImpl;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
