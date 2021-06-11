package com.liuxin.abstractTest;

/*
* 模板方法


 */
public class TemplateTest {
    public static void main(String[] args) {
        Template t=new SubTemplate();
        t.spendTime();
    }
}

abstract class Template{

    //固定部分
    public void spendTime(){
        long start=System.currentTimeMillis();
        code();
        long end=System.currentTimeMillis();
        System.out.println("花费的时间为:"+(end-start));
    }
    //可变部分
    public abstract void code();
}


class SubTemplate extends Template{

    @Override
    public void code() {
        for(int i=2; i<=10000; i++){
            for(int j=2;j<10000;j++){
                int c=i+j;
            }
        }
    }
}