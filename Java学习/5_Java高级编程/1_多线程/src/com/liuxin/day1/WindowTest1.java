package com.liuxin.day1;


class Window1 implements Runnable{

    private int ticket=100;
    @Override
    public void run() {
        while (true){
            if(ticket>0){

                System.out.println(Thread.currentThread().getName()+":卖票，票号 "+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}


public class WindowTest1 {

    public static void main(String[] args) {
        Window1 w1=new Window1();
        Thread t1=new Thread(w1);
        Thread t2=new Thread(w1);
        Thread t3=new Thread(w1);

        t1.start();
        t2.start();
        t3.start();

    }
}
