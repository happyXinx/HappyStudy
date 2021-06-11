package com.liuxin.java1;

/*
重载overload
1.定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数和参数类型不同即可。
    "两同一不同"：同一个类、相同方法名
    同一个类、相同方法名
    参数列表不同：参数个数不同、参数类型不同

2.举例：
Arrays类中重载sort()

3. 判断是否重载：
跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系
 */

public class OverloadTest {

    public static void main(String[] args) {
        OverloadTest test=new OverloadTest();
        test.getSum(1,2);
        test.getSum(1.1,2.2);

    }
    //如下两个方法构成重载
    public void getSum(int a, int b){
        System.out.println(a+b);
    }

    public void getSum(double a, double b){
        System.out.println(a+b);
    }



}
