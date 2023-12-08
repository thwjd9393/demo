package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        System.out.println("test");

        Person ps = new Person("홍길동", "22");

        ps.createPerson();

        System.out.println("test22");
        System.out.println("test33");
    }

}
