package com.bintang.belajar.spring.dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bintang.belajar.spring.dasar.data.Connection;
import com.bintang.belajar.spring.dasar.data.Server;

@Configuration
public class LifeCycleConfiguration {

  @Bean
  public Connection connection(){
    return new Connection();
  }

  // @Bean(initMethod = "start", destroyMethod = "stop")
  @Bean
  public Server server(){
    return new Server();
  }

}
