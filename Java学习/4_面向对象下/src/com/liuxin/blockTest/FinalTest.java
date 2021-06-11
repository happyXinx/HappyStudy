package com.liuxin.blockTest;

/*
* final: 最终的
*
* 1. final可以用来修饰的结构：类、方法、变量
*
* 2. final用来修饰的类： 不能被继承（String、System、StringBuffer类）
* 3. final用来修饰方法，表明此方法不能被重写
* 4. final用来修饰变量，此时变量就是一个常量
*   4.1 final修饰属性，显示初始化、代码块中初始化、构造器中初始化
*   4.2 final修饰局部变量：
*       尤其是使用final修饰形参时，表明此形参是一个常量，不能在修改
*
* static final 用来修饰属性：全局常量
*
*

 */

public class FinalTest {
    public static void main(String[] args) {
    }
}


final class FinalA{
    final int A;

    public FinalA(){
        A=10;
    }

    public FinalA(int a){
        A=a;
    }

    public void finalTest(final int f){

    }

}
