package com.bintang.belajar.spring.dasar.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.bintang.belajar.spring.dasar.data.Foo;

public class WithoutSpringBootTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(FooApplication.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testFoo() {
    Foo foo = applicationContext.getBean(Foo.class);
  }
}
