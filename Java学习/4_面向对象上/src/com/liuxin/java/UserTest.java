package com.liuxin.java;
/*
成员变量 vs 局部变量

1. 相同点：


2. 不同点：
2.1 声明位置不同
     属性：直接定义在类的{}内
     局部变量：声明在方法内、方法形参、代码块内、
2.2 关于权限修饰符不同
属性：可以使用 public private protected
局部变量：不可使用
2.3 默认初始化
属性：可以默认初始化
局部变量:必须显式赋值

 */


public class UserTest {
    public static void main(String[] args) {
        User u=new User();
        System.out.println(u.age);
        System.out.println(u.name);
        System.out.println(u.isMale);
        u.talk("日语") ;
    }
}

class User{


    String name;
    int age;
    boolean isMale;

    public void talk(String language){
        System.out.println(language);
    }
    public void eat(){
        String food="烙饼";
        System.out.println(food);
    }
}