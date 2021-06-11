package com.liuxin.java1;

/*
1. jdk5.0新增内容
2. 具体使用：
    2.1 可变参数形参的格式：数据类型...变量名
    2.2 传入参数的个数可以是0个，1个，多个...
    2.3 可变参数形参在方法的形参中，最多只能声明一个可变形参。
 */

public class MethodArgsTest {

    public static void main(String[] args) {
        MethodArgsTest m=new MethodArgsTest();
        String[] ss={"11","22","33"};
        m.show("123");
        m.show("11","22","33");
    }

    public void show(int i){

    }

    public void show(String s){
        System.out.println("hello");
    }

    public void show(String ... strs){
        System.out.println("args");
    }

}
