package com.liuxin.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * 1. Set接口没有额外定义新的方法，使用的都是Collection中声明过的方法
 * 要求：向Set中添加的数据，其所在类一定要重写hashCode和equals方法
 *      要求重写的hashCode和equal尽可能保持一致性：相等的对象必须具有相等的散列码
 *
 *
 * 2.
 *
 */

public class SetTest {

    /*
    无序、不可重复的数据

    1. 无序性：存储的数据在底层数组中并非按照数组的索引顺序添加，而是根据数据的hash值确定的

    2. 不可重复性：保证添加的元素按照euals判断时，不能返回true。
    即：相同的元素只能添加一个。

    二、添加元素的过程，以HashSet为例：
        我们向HashSet中添加元素a,首先调用元素a所在类的hashCode()方法，根据hash值判断索引位置，
        若此位置没有元素，直接添加
        若此位置有元素或以链表形式存在多个元素，则比较元素a与元素b的hash值，
            若hash值不同，则调用equals方法继续比较。

        添加元素：jdk8 原来的元素在数组中，指向新的元素，jdk7与8相反 七上八下


     */

    @Test
    public void test1(){

        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add("CC");
        set.add(new User("Tom", 123));
        set.add(new User("Tom", 123));

        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }



}
