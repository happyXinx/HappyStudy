package com.liuxin.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历操作，使用Iterator接口
 * iterator对象称为迭代器，主要用于遍历Collection集合中的元素
 * 提供一种方法访问一个容器对象中各个元素，而又不暴露对象的内部细节。
 *
 * 集合对象每次调用iterator()方法都会得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前。
 *
 */

public class IteratorTest {

    @Test
    public void test1(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new Person("Jerry", 20));
        collection.add(new String("Tom"));
        collection.add(false);

        Iterator iterator = collection.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    @Test
    public void test2(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new Person("Jerry", 20));
        collection.add(new String("Tom"));
        collection.add(false);

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if ("Tom".equals(obj)){
                iterator.remove();
            }
        }

        iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
