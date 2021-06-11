package com.liuxin.java1;

/*
* 递归方法的使用
* 一个方法体内调用本身


 */

public class RecursionTest {

    public static void main(String[] args) {
        RecursionTest r=new RecursionTest();
        System.out.println(r.sum(100));
    }

    //例1,计算1-100所有自然数的和
    public int sum(int value){
        if(value==1){
            return 1;
        }else {
            return value+sum(value-1);
        }
    }

}
