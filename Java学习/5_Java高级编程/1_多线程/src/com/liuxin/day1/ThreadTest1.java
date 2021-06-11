package com.liuxin.day1;

/*
* 创建多线程的方式二：实现Runnable接口
* 1. 创建一个实现了Runnable接口的类
* 2. 实现Runnable接口的抽象方法
* 3. 创建实现类的对象
* 4. 创建Thread类的对象
* 5. 通过Thread类的对象调用start()


* 比较创建线程两种方式
*  开发中:优先选择实现Runnable接口的方式
*  原因：1. 没有类的单继承的局限性
*       2. 更适合有数据共享的情况
*
* 相同点：两种方式都需要重写run， 
*
*
 */

class MThread implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

public class ThreadTest1 {

    public static void main(String[] args) {
        MThread mThread = new MThread();
        new Thread(mThread).start();
        Thread t2=new Thread(mThread);
        t2.setName("线程2");
        t2.start();
    }
}
