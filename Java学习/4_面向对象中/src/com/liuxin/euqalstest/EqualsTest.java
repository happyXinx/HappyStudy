package com.liuxin.euqalstest;

public class EqualsTest {

    public static void main(String[] args) {
        int a=10;
        int b=10;
        System.out.println(a==b);

        Customer c1=new Customer("a",10);
        Customer c2=new Customer("a",10);
        System.out.println(c1.equals(c2));

        String s1="hh";
        String s2="hh";
        System.out.println(s1.equals(s2));


    }
}


class Customer{
    private String name;
    private int age;

    public Customer(String name, int age){
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }

        if(obj instanceof Customer){
            Customer c=(Customer)obj;
            return this.getAge()==c.getAge() && this.getName()==c.getName();
        }
        return false;
    }

}