package com.liuxin.extendsTest;

public class Student extends Person{

    private String major;

    public Student(){

    }

    public Student(String name, int age, String major){
        this.name=name;
        this.age=age;
        this.major=major;
    }

    public void study(){
        System.out.println("学习");
    }
}



