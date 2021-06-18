package com.liuxin.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * jdk 5.0新增了foreach循环，用于遍历集合、数组
 *
 */

public class ForTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        //for( 集合元素的类型 局部变量： 集合对象)
        //内部仍然调用了迭代器。
        for(Object obj : coll){
            System.out.println(obj);
        }
    }

    @Test
    public void test02(){
        String[] arr = new String[]{"MM","MM","MM"};
        //方式一：
        for (int i=0 ;i<arr.length; i++){
            arr[i] = "GG";
        }

         //方式二：
        for (String s : arr){
            s = "GG";
        }

        for (int i=0 ;i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }


}
