package com.liuxin.test;

public class SeasonTest1 {

    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);

        Season1[] values = Season1.values();
        for(int i=0; i<values.length; i++){
            System.out.println(values[i]);
        }

    }
}

//使用enum关键字来定义枚举类
enum Season1{

    //1. 提供当前枚举类的对象，多个对象之间有逗号隔开,末尾用;结束
    SPRING("春","春"),
    SUMMER("夏","夏"),
    AUTUMN("秋","秋"),
    WINTER("冬","冬");

    //2. 声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

class superClass{

    public void test(){
        System.out.println(1);
    }

}

interface info{

   void test2();
}

class subClass extends superClass implements info{
    @Override
    public void test() {
        super.test();
    }

    public void test(int a){
        System.out.println(a);
    }

    @Override
    public void test2() {

    }
}
