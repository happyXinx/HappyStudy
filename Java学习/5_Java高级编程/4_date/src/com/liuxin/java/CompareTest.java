package com.liuxin.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 一、java对象排序，Comparable或Comparator
 *
 *
 *  二、Comparable接口的使用
 */

public class CompareTest {

    /*
    Comparable接口的使用举例
    1. 像String、包装类等实现了Comparable接口，重写了compareTo(obj)方法，给出了比较两个对象大小的方式
    2. 重写compareTo(obj)的规则：
        若当前对象this大于形参对象obj，则返回正整数，
        若当前对象this小于形参对象obj，则返回负数，
        若相等，则返回负数
    3.
     */
    @Test
    public void test1(){
        String[] arr = new String[]{"AA","CC","ZZ","GG"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("liuxin", 34);
        arr[1] = new Goods("liuxin1", 68);
        arr[2] = new Goods("liuxin2", 20);
        arr[3] = new Goods("liuxin3", 10);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
    Comparator接口的使用：定制排序
    1. 当元素类型没有实现comparable接口而又不方便修改代码，那么则考虑使用comparator来排序

    2. 重写compare(object o1, object o2)方法，来比较o1和o2的大小。

     */
    @Test
    public void test3(){
        String[] arr = new String[]{"AA","CC","ZZ","GG"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });

        System.out.println(Arrays.toString(arr));
    }

}
