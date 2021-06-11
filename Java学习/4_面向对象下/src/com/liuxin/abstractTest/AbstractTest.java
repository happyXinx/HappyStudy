package com.liuxin.abstractTest;

/*
* 1. abstract: 抽象的
* 2. abstract: 可以用来修饰的结构：类、方法
* 3. abstract修饰类：
*   a. 不能实例化
*   b. 抽象类中仍然有构造器
*   c. 开发中，都会提供抽象类的子类、让子类对象实例化、完成相关的操作
*
* 4. abstract修饰方法：
*   a. 抽象方法只有方法的声明，没有方法体
    b. 包含抽象方法的类是一个抽象类，反正，抽象类中可以没有抽象方法。
*   c. 若子类重写了父类中所有的抽象方法，此子类可实例化
*
* 5. 注意点：
*   a. 不能修饰属性、构造器
*   b. 不能用来修饰私有方法、静态方法、final的方法、final的类
*
*
 */

public class AbstractTest {

    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.eat();


    }

}


abstract class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }


    public abstract void eat();

    public void walk(){
        System.out.println("walk");
    }

}

class Student extends Person{


    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃套餐");
    }


}
