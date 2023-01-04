package com.bintang.belajar.spring.dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bintang.belajar.spring.dasar.data.Bar;
import com.bintang.belajar.spring.dasar.data.Foo;
import com.bintang.belajar.spring.dasar.data.FooBar;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {

  @Bean
  public Foo foo(){
    return new Foo();
  }

  @Bean
  public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
    return new FooBar(foo.orElse(null), bar.orElse(null));
  }

}
