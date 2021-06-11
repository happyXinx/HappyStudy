package com.liuxin.day3;

public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person(3,"liuxin");
    }
}

class Person{
    private int age;
    private String name;

    public Person(){
        System.out.println("Person()");
    }

    public Person(int age){
//        this();
        System.out.println("Person(age)");
    }

    public Person(int age, String name){
        this(age);
        System.out.println("Person(age, name)");
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
}