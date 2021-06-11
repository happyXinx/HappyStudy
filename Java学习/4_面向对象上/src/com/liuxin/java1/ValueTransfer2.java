package com.liuxin.java1;



public class ValueTransfer2 {
    public static void main(String[] args) {
        Data d=new Data();
        ValueTransfer2 v=new ValueTransfer2();
        System.out.println(d.m+","+ d.n);
        v.swap(d);
        System.out.println(d.m+","+ d.n);
    }

    public void swap(Data d){
        int temp=d.m;
        d.m=d.n;
        d.n=temp;
    }
}


class Data{
    int m=10;
    int n=20;
}