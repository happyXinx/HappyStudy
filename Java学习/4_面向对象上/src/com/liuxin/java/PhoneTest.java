package com.liuxin.java;

/*

匿名对象：我们创建的对象，没有显式的赋给一个变量名。即为匿名对象。
匿名对象只能使用一次

 */
public class PhoneTest {
    public static void main(String[] args) {
        //匿名对象
        new Phone().playGame();
        new Phone().sendEmail();
    }
}


class Phone{
    double price;

    public void sendEmail(){
        System.out.println("email");
    }

    public void playGame(){
        System.out.println("game");
    }
}
