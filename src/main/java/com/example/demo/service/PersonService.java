package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  public Person getPerson() {
    return new Person().builder()
        .name("hoge")
        .age(16)
        .gender("man")
        .build();
  }
}