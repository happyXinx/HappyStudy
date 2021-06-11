package com.liuxin.staticTest;

//单例模式的懒汉式实现

public class SingletonTest2 {
}

class Order{

    //1. 私有化类构造器
    private Order(){

    }
    //2.声明当前类对象
    private static Order instance=null; //声明当前类对象

    public static Order getInstance(){

        if(instance==null){
            instance=new Order();
        }

        return instance;
    }

}
