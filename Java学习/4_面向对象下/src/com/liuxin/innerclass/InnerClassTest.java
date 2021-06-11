package com.liuxin.innerclass;

/*
* 内部类
* Java中允许将一个类声明在另一个类B中，则类A就是内部类、类B称为外部类
*
* 分类；成员内部类(静态、非静态) vs 局部内部类（方法内、代码块内、构造器内）
*
*
*
*



 */

public class InnerClassTest {
    public static void main(String[] args) {
        //静态内部类调用
        new Person.Dog().show();

        //非静态内部类调用
        Person p=new Person();
        Person.Bird b=p.new Bird();
        b.display("hh");

    }
}


class Person{
    String name="刘欣";
    int age;

    public void eat(){
        System.out.println("吃饭");
    }

    static class Dog{
        String name;
        int age;

        public void show(){
            System.out.println("狗狗");
        }
    }

    class Bird{
        String name="玄凤";
        public void display(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
        }
    }

}