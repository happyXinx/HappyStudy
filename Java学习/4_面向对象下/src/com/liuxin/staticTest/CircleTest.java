package com.liuxin.staticTest;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle();
        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println("创建圆的个数为"+Circle.getTotal());
    }

}

class Circle{

    private double redius;
    private int id;

    private static int total; //记录创建圆的个数
    private static int init=1001; //static声明的属性被所有对象共享

    public Circle(){
        id=init++;
        total++;
    }

    public Circle(double redius){
        this();
        this.redius=redius;
    }

    public double findArea(){
        return Math.PI*redius*redius;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }
}
