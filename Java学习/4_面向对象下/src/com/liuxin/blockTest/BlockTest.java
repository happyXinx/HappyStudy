package com.liuxin.blockTest;

/*
* 静态代码块：
*   内部可以有输出语句
*   随着类的加载而执行
*   作用：初始化类的信息
*
* 非静态代码块：
*   内部可以有输出语句
*   随着对象的创建而执行
*   每创建一个对象，就执行一次非静态代码块
*   作用：可以在创建对象时，对对象属性进行初始化
*
* 对象属性可以赋值的位置：
* 1. 默认初始化
* 2. 显示初始化/在代码块中赋值 (谁在前，先赋值)
* 3. 构造器中初始化
* 4. 有了对象以后，可以通过对象.属性或对象.方法的方式进行赋值
*
 */

public class BlockTest {
    public static void main(String[] args) {
        //Person p=new Person();
        System.out.println(Person.desc);
    }
}

class Person{
    String name;
    int age;
    static String desc="person";
    public Person(){

    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }


    {
        System.out.println("block");
    }


    static {
        System.out.println("static block");
    }

    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
