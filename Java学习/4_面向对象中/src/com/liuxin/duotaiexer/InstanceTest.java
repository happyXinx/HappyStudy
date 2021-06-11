package com.liuxin.duotaiexer;

public class InstanceTest {

    public static void main(String[] args) {
        method(new Graduate());
    }

    public static void method(Person e){
        System.out.println(e.getInfo());
        if(e instanceof Graduate){
            System.out.println("Graduate");
        }else if(e instanceof Student){
            System.out.println("Student");
        }else{
            System.out.println("Person");
        }
    }
}

class Person{
    protected String name="person";
    protected int age=50;

    public String getInfo(){
        return "Name: "+name+"\n"+"age: "+age;
    }
}

class Student extends Person{
    protected String school="pku";
    @Override
    public String getInfo(){
        return "Name: "+name+"\nage:"+age+"\nschool:"+school;
    }
}

class Graduate extends Student{
    public String major="IT";
    @Override
    public String getInfo() {
        return "Name: "+name+"\nage:"+age+"\nschool:"+school+"\nmajor:"+major;
    }
}



