package com.liuxin.interfaceTest;

/*
* 接口
* 1.JDK 7及以前：
*   全局常量：public static final
*   抽象方法：public abstract
* JDK 8及以后：
*   还可定义静态方法、默认方法
*
* 2. 接口中不能定义构造器
* 3. Java开发中，让类实现（implements）来实现接口
*   a. 如果实现类实现了接口中的所有抽象方法，则此实现类就可以实例化
*   b. 如果实现类没有实现接口中的所有抽象方法，则此实现类为抽象类
*
* 4. java类可以实现多个接口
*
* 5. 接口和接口之间可以继承，而且可以多继承
*
* 接口和抽象类的异同？

 */

import java.lang.reflect.Field;

public class InterfaceTest {

    public static void main(String[] args) {
        Plain p=new Plain();
        p.fly();
        p.stop();
    }

}

interface Fly{

    double MAX_SPEED=79000;
    double MIN_SPEED=1;
    public abstract void fly();
    void stop();

}

class Plain implements Fly{

    @Override
    public void fly() {
        System.out.println("起飞");
    }

    @Override
    public void stop() {
        System.out.println("停止");
    }
}

abstract class BadPlain implements Fly{

}

