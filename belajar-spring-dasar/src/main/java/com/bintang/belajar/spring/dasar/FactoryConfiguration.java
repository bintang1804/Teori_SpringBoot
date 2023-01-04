package com.bintang.belajar.spring.dasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.bintang.belajar.spring.dasar.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
