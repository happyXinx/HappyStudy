package com.liuxin.test;

/**
 * 一、枚举类的使用
 * 1. 类的对象是有限个、确定的。我们称此类为枚举类
 * 2. 当需要定义一组常量时，强烈建议使用枚举类
 * 3. 如果枚举类中只有一个对象，则可以作为单例模式的实现方式。
 *
 * 二、如何定义枚举类
 * 方式一：jdk5.0之前，自定义枚举类
 * 方式二：
 */

public class SeasonTest {
}


//自定义枚举类
class Season{
    //1. 声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2。 私有化类构造器，并给对象赋值
    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3. 提供当前枚举类的多个对象： public static final
    public static final Season SPRING = new Season("春","春");
    public static final Season SUMMER = new Season("夏","夏");
    public static final Season AUTUMN = new Season("秋","秋");
    public static final Season WINTER = new Season("冬","冬");

    //4. 其他诉求


}
