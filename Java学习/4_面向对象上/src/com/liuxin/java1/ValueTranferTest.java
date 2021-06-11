package com.liuxin.java1;

/*
关于变量的赋值

    如果变量是基本数据类型，此时赋值的是变量所保存的数据值
    如果变量是引用数据类型，此时赋值的是变量所保持数据的地址值。

方法的形参的传递机制：值传递

    1. 形参：方法定义时，声明的小括号内的参数
    2. 实参：方法调用时，实际传递给形参的数据

    如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值
    如果参数是引用数据类型，此时实参付给形参的是实参存储数据的地址值。

 */
public class ValueTranferTest {
    public static void main(String[] args) {
//        int n=10;
//        int m=n;
//        System.out.println(m);
//        System.out.println(n);
//        System.out.println("***************");
//        n=20;
//        System.out.println(m);
//        System.out.println(n);
        int m=10;
        int n=20;

        System.out.println(m+","+n);
        ValueTranferTest v=new ValueTranferTest();
        v.swap(m, n);//实参
        System.out.println(m+","+n);
    }

    public void swap(int m, int n){ //形参
        int temp=m;
        m=n;
        n=temp;
    }
}
