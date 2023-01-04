package com.bintang.belajar.spring.dasar;

import com.bintang.belajar.spring.dasar.ScanConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.bintang.belajar.spring.dasar.data.Bar;
import com.bintang.belajar.spring.dasar.data.Foo;

public class ScanTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testScan() {

    Foo foo = applicationContext.getBean(Foo.class);
    Bar bar = applicationContext.getBean(Bar.class);

  }
}
