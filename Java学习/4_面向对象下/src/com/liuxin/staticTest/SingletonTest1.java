package com.liuxin.staticTest;

public class SingletonTest1 {

    public static void main(String[] args) {
        Bank b1=Bank.getInstance();
        Bank b2=Bank.getInstance();
        System.out.println(b1==b2);
    }

}

//单例模式：饿汉式实现
class Bank{

    private static Bank instance=new Bank();

    private Bank(){

    }

    public static Bank getInstance(){
        return instance;
    }


}
