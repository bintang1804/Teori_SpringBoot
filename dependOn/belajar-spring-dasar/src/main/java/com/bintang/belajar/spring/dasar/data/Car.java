package com.bintang.belajar.spring.dasar.data;

import lombok.Getter;
import org.springframework.stereotype.Component;
import com.bintang.belajar.spring.dasar.aware.IdAware;

@Component
public class Car implements IdAware {

  @Getter
  private String id;

  @Override
  public void setId(String id) {
    this.id = id;
  }
}
