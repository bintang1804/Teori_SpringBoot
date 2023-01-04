package com.bintang.belajar.spring.dasar.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import com.bintang.belajar.spring.dasar.data.User;

public class LoginSuccessEvent extends ApplicationEvent {

  @Getter
  private final User user;

  public LoginSuccessEvent(User user){
    super(user);
    this.user = user;
  }

}
