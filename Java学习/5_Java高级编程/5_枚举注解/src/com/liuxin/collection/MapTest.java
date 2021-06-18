package com.liuxin.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 一、Map: 双列数据，存储键值对 类似于y=f(x)
 *  HashMap：作为Map的主要实现类，线程不安全。存储null的key和value
 *      linkedHashMap: 保证在遍历map元素时，可以按照添加的顺序实现遍历。
 *                  原因：在原有的HashMap基础上，添加一对指针，指向前一个和后一个元素。
 *                  对于频繁的遍历操作，此类执行效率高于HashMap。
 *  TreeMap：保证按照添加的key-value对进行排序，实现排序遍历。按照key的自然顺序。
 *  HashTable: 作为古老的实现类，线程安全，效率低。不能存储null的key和value。
 *      常用来处理配置文件，key和value都是string类型
 *
 *
 *  二、Map结构的理解
 *  Map中的key: 无序的、不可重复的，使用set存储所有的key ---> key所在类要重写equals和hashCode
 *  Map中的value: 无序的、可重复的，使用collection来存储所有的value
 *  一个键值对：key-value构成了一个Entry对象
 *  Map中的entry: 无序的、不可重复的，使用set存储所有的entry。
 *
 *  面试题：
 *  1. HashMap底层原理
 *      jdk 7 数组+链表
 *      jdk 8 数组+链表+红黑树
 *
 *  2. HashMap和HashTable的异同
 *  3. CurrentHashMap和HashTable的异同
 */

public class MapTest {

    @Test
    public void test1(){

        Map map = new HashMap();


    }

}
