package com.liuxin.day3;

public class TriAngle {

    private double base;
    private double height;

    public TriAngle(){

    }

    public TriAngle(double b, double h){
        base=b;
        height=h;
    }

    public void setBase(double b){
        base=b;
    }

    public void setHeight(double h){
        height=h;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }
}
