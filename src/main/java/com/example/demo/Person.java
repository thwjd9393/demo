package com.example.demo;

public class Person {

    private String name;
    private String age;

    public Person() {

    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }


    public void createPerson() {
        System.out.println(name + " : " + age);
    }

}
