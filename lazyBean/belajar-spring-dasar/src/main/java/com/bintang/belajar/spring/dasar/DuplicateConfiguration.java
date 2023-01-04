package com.bintang.belajar.spring.dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bintang.belajar.spring.dasar.data.Foo;

@Configuration
public class DuplicateConfiguration {

  @Bean
  public Foo foo1(){
    return new Foo();
  }

  @Bean
  public Foo foo2(){
    return new Foo();
  }

}
