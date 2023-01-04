package com.bintang.belajar.spring.dasar;

public class Database {

  private static Database database;

  public static Database getInstance(){
    if(database == null){
      database = new Database();
    }
    return database;
  }

  private Database(){

  }

}
