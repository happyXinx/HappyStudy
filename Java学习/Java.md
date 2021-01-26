### 1. Java语言概述

#### 1.1 java语言特点

##### 1）面向对象

类、对象；封装、继承、多态

##### 2）健壮性

吸收了C/C++语言的优点，但去掉了其影响程序健壮性的部分（如指针、内存的申请和释放等），提供了一个相对安全的内存管理和访问机制。

##### 3）跨平台性

需要先安装Java虚拟机（JVM JAVA VIRTUAL MACHINE）

![1611671729100](Java.assets/1611671729100.png)

#### 1.2 核心机制

##### Java虚拟机 (Java Virtual Machine)

JVM是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据、内存、寄存器。

![1611672267890](Java.assets/1611672267890.png)

##### 垃圾收集机制（Garbage Collection）

#### 1.3 环境搭建

##### JDK

Java Development Kit Java开发工具包

##### JRE

Java Runtime Environment Java运行环境

##### JDK JRE JVM三者关系

![1611672512203](Java.assets/1611672512203.png)

简单来说，使用JDK的开发工具完成的Java程序，交给JRE去运行。

![1611672568469](Java.assets/1611672568469.png)

##### 下载JDK

##### 配置环境变量

环境变量：windows操作系统执行命令时所要搜寻的路径。

根据windows系统在查找可执行程序的原理，可以将java工具所在路径定义到path环境变量中。

步骤：

1）新增JAVA_HOME=JDK所在路径

2）path中添加%JAVA_HOME%\bin;

3) dos中输入java， javac， java -version等命令验证环境变量是否配置成功

#### 1.4  HelloWorld开发

步骤：

1. 编写.java文件；
2. 通过javac命令对该java文件进行编译；
3. 通过java命令对生成的class文件运行。

![1611672987110](Java.assets/1611672987110.png)

Test.java内容

```java
public class Test{
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}
```

编译，运行

```
javac Test.java
java Test
```

注意：

* Java语言严格区分大小写
* 一个源文件最多只能有一个public类，其他类的个数不限；如果源文件包含一个public类，则文件名必须按该类名命名。

#### 1.5 注释

注释类型：

单行注释

* 格式： //

多行注释

* 格式： /*   */

文档注释

* 格式：

  /** 

  @author: liuxin

  @version: v2.0

   */

* 注释内容可以被JDK所提供的工具javadoc所解析，生成一套网页形式的说明文档。

* 代码

  ```
  javadoc -d mydoc -author -version HelloWorld.java 
  ```

  若包含中文，则需要指定编码

  ```
  javadoc -d mydoc -author -version -encoding UTF-8 -charset UTF-8  HelloWorld.java
  ```

#### 1.6 Java API

Application  Programming Interface， 应用程序编程接口是Java提供的基本编程接口。

Java语言提供了大量的基础类，提供了相应的方法，API文档用于告诉开发者如何使用这些类，以及这些类里包含的方法。





