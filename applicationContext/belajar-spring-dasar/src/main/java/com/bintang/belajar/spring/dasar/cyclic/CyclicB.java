package com.bintang.belajar.spring.dasar.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicB {

  private CyclicC cyclicC;
}
