package com.liuxin.collection;

import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

    /*
    1. 向TreeSet中添加的数据，要求是同类的对象
    2. 两种排序方式： 自然排序和定制排序（Comparator）
        比较两个对象是否相同的标准为：compareTo()返回0，不再是equals
     */

    @Test
    public void test1(){

        TreeSet set = new TreeSet();

        set.add(new User("Tom", 12));
        set.add(new User("Jerry", 12));
        set.add(new User("Chenwei", 16));
        set.add(new User("Liuxin", 12));
        set.add(new User("Chenwei", 12));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2(){

        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
//                    return ((User) o1).getAge()-((User) o2).getAge();
                    return Integer.compare(((User) o1).getAge(), ((User) o2).getAge());
                }
                throw new RuntimeException("输入类型不匹配");
            }
        };

        TreeSet set = new TreeSet(com);

        set.add(new User("Tom", 9));
        set.add(new User("Jerry", 9));
        set.add(new User("Chenwei", 16));
        set.add(new User("Liuxin", 10));
        set.add(new User("Chenwei", 9));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
