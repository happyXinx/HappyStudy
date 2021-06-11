package com.liuxin.duotai;

public class PersonTest {
    public static void main(String[] args) {

        Person p=new Man();
        p.eat();

        Person p2=new Women();
        p2.eat();

        System.out.println("*****************************");

        Man m1=(Man)p;
        m1.isSmoking=true;

        if(p instanceof Women){
            Women m2=(Women)p;
            m2.likeMovie=true;
            System.out.println("*******发生强制类型转换*****");
        }

    }
}
