package com.liuxin.day2;

/*
同步问题或者叫线程安全问题

方式1：同步代码块
synchronized(同步监视器){
    //需要被同步的代码


}

同步监视器：俗称：锁。任何一个类的对象，都可以充当锁
要求：多个线程必须要共用同一把锁

方式2：同步方法


同步的优劣：
好处：解决线程的安全问题
坏处：只能有一个线程参与，其他线程等待，效率低。


 */

class Window3 implements Runnable{

    private int ticket=50;
    @Override
    public void run() {
        while (true){

            show();

        }
    }

    public synchronized void show(){
        if(ticket>0){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":卖票，票号 "+ticket);
            ticket--;
        }
    }

}


public class WindowTest3 {

    public static void main(String[] args) {
        Window3 w3=new Window3();
        Thread t1=new Thread(w3);
        Thread t2=new Thread(w3);
        Thread t3=new Thread(w3);

        t1.start();
        t2.start();
        t3.start();

    }
}
