package com.liuxin.collection;


import org.junit.Test;

import java.util.*;

/**
 * 集合框架概述
 * 1. 集合、数组都是对多个数据进行存储的结构。此时的存储是内存层面的存储，不是持久化的存储
 *
 * 2.1 数组在存储多个数据方面的特点：
 *    1） 初始化后，长度就确定了
 *    2）一旦定义好后，其元素类型就确定了。
 *
 * 2.2 数组在存储数据的缺点：
 *    1） 初始化后，长度不可修改
 *    2）数组中提供的方法有限，对于添加、删除、插入数据等操作，不便。
 *
 * 二、集合框架
 *  |---Collection接口：单列集合，用来存储一个一个的对象
 *      |---list接口：存储有序的、可重复的数据  ”动态数组“
 *          |--- ArrayList : 作为List的主要实现类; 线程不安全，效率高；底层使用Object[]存储
 *          |--- LinkedList : 对于频繁插入删除操作，使用此类比arrayList高 底层使用使用了双向链表
 *          |--- Vector : List接口的古老实现类：线程安全，效率低。
 *
 *      |---set接口：存储无序的、不可重复的数据  ”“
 *          |--- Hashset : 作为Set接口的主要实现类，线程不安全，可以存储null值
 *          |--- LinkedHashSet： 作为HashSet子类，遍历其内部数据值，可以按照其添加的数据遍历。对于频繁的遍历操作，LinkedHashSet效率高于
 *          HashSet.
 *          |--- TreeSet：可以按照对象的指定属性进行排序，
 *
 *  |---Map接口：键值对
 *      |--- HashMap、LinkedHashMap TreeMap Hashtable properties
 *
 *
 *  ArrayList的源码分析：jdk 7情况下，原来大小为10，
 *      jdk 8中ArrayList的变化：
 *          1）初始化时并没有创建长度为10的数组
 *              ArrayList list = new ArrayList();
 *              list.add(123); 第一次使用add()时，底层才创建了长度为10的数组，并将数据添加到element中
 *              后续的添加与扩容操作与jdk7 无异
 *
 *  总结：常用方法
 *  增：add(obj)
 *  删：remove(index)/remove(obj)
 *  改：set(index, obj)
 *  查：get(index)
 *  插：add(index, obj)
 *  长度：size
 *  遍历：iterator  增强for循环 普通循环
 *
 *
 *
 */

/**
 *
 * 向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals()方法
 *
 *
 */

public class CollectionTest {

    @Test
    public void test1(){

        Collection collection = new ArrayList();

        collection.add("AA");
        collection.add(123);
        collection.add(new Date());

        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());

    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(false);

        coll.remove(1234);
        System.out.println(coll);

        coll.remove(new Person("Jerry",20));
        System.out.println(coll);

        // 8.集合到数组：toArray()
        Object[] arr = coll.toArray();
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        //扩展：数组到集合：调用Arrays类的静态方法asList
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);
    }

    @Test
    public void testListRemove(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }

    private void updateList(List list){
        list.remove(new Integer(2));
    }

}
