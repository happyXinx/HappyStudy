package com.liuxin.annotation;

/**
 * 自定义注解：
 * 1. 注解声明为 interface
 * 2. 定义内部成员，通常使用value表示
 * 3. 可以指定成员的默认值，使用default定义
 * 4. 如果自定义注解没有成员，表明一个标识作用。
 *
 *
 * 如果注解有成员，在使用注解时，需要指明成员的值。
 *
 * 5. JDK 5.0提供了4个标准的meta-annotation类型，分别是：
 * 元注解： 对现有的注解进行解释说明的注解
 *
 * retention：指定所修饰的Annotation的生命周期：SOURCE\CLASS(默认行为)\RUNTIME(只有声明为runtime的注解才能通过反射获取)
 * target:指定注解能够修饰哪些元素
 * 出现频率较低
 * documented：表示所修饰的注解在被javadoc解析时，保留下来。
 * inherited：被它所修饰的Annotation将具有继承性。
 *
 * 6. jdk 8中注解的新特性：可重复注解、类型注解
 * 6.1 可重复注解
 * 1）在Myannotation上声明Repeatable，成员值为Myannotation.class
 * 2)myannotation和myannotations的retention和myannotations相同。
 *
 * 6.2 类型注解 type_paramter: 可用于泛型， type_use: 可用于任何语句中，比如异常等
 *
 */

public @interface MyAnnotation {

    String value() default "hello";

}
