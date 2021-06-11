package com.liuxin.java1;

public class ValueTransferTest3 {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        method(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void method(int a, int b){
        a*=10;
        b*=10;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.exit(0);
    }

}
