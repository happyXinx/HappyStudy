package com.liuxin.test;

/*
* 包装类
*
 */

import org.junit.Test;

public class WrapperTest {

    @Test
    public void test1(){
        Integer int1=10;
        System.out.println(int1.toString());
    }

    @Test
    public void test2(){
        Order o=new Order();
        System.out.println(o.isFemale);
        System.out.println(o.isMale);
    }

    //包装类转换为基本数据类型
    @Test
    public void test3(){
        Integer in1=new Integer(12);
        int i1=in1.intValue();

    }

    //JDK5.0新特性：自动装箱和拆箱
    @Test
    public void test4(){
        int num2=10;
        Integer in1=num2; //自动装箱

        int num3=in1; //自动拆箱

    }

    //基本数据类型，包装类-》String类型
    @Test
    public void test5(){
        //方式1：连接运算
        int num1=10;
        String str1=num1+" ";

        //方式2: 调用String的valueof
        float f1=1.34f;
        String str2=String.valueOf(f1);
        Double d1=13.45;
        String str3=String.valueOf(d1);
    }

    //String类型->转换为基本数据类型和包装类
    @Test
    public void test6(){
        //方式1：连接运算
        int num1=10;
        String str1=num1+" ";

        //方式2: 调用String的valueof
        float f1=1.34f;
        String str2=String.valueOf(f1);
        Double d1=13.45;
        String str3=String.valueOf(d1);
    }

    @Test
    public void test7(){
        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==j);

        Integer m=1;
        Integer n=1;
        System.out.println(m==n);

        //Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
        //保存了-128-127范围的整数。如果我们使用自动装箱的方式，给Integer赋值的范围在-128-127之间时，可以直接使用数组的元素，
        //不用再去new了。

        Integer x=128;
        Integer y=128;
        System.out.println(x==y);


    }

}

class Order{
    boolean isMale;
    Boolean isFemale;

}

