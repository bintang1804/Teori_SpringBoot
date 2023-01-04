package com.bintang.belajar.spring.dasar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.bintang.belajar.spring.dasar.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {

  @Primary
  @Bean
  public CustomerRepository normalCustomerRepository(){
    return new CustomerRepository();
  }

  @Bean
  public CustomerRepository premiumCustomerRepository(){
    return new CustomerRepository();
  }

}
