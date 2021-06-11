package com.liuxin.java;

/*

1. 创建类
2. 创建类的对象
3. 通过对象.属性 对象.方法调用

 */

public class PersonTest {
    public static void main(String[] args) {
        //类的实例化 = 创建对象
        Person p=new Person();
        p.name="liuxin";
        System.out.println(p.name);
        p.eat();
    }
}


class Person{

    //属性 field
    String name;
    int age;
    boolean isMale;

    //方法 method
    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }

}