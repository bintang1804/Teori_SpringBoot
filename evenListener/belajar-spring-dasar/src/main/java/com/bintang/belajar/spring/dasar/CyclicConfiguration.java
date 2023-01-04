package com.bintang.belajar.spring.dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bintang.belajar.spring.dasar.cyclic.CyclicA;
import com.bintang.belajar.spring.dasar.cyclic.CyclicB;
import com.bintang.belajar.spring.dasar.cyclic.CyclicC;

@Configuration
public class CyclicConfiguration {

  @Bean
  public CyclicA cyclicA(CyclicB cyclicB) {
    return new CyclicA(cyclicB);
  }

  @Bean
  public CyclicB cyclicB(CyclicC cyclicC) {
    return new CyclicB(cyclicC);
  }

  @Bean
  public CyclicC cyclicC(CyclicA cyclicA) {
    return new CyclicC(cyclicA);
  }

}
