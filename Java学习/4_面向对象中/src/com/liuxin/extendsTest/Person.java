package com.liuxin.extendsTest;

public class Person {

    int age;
    String name;

    public Person(){

    }

    public Person(int age, String name){
        this.age=age;
        this.name=name;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
