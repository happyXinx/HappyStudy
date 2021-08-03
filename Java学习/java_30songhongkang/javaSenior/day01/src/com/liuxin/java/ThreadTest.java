package javaSenior.day01.src.com.liuxin.java;

//创建两个线程：一个打印1-100的偶数，一个打印1-100的奇数

class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<=100; i++){
            if (i%2==0)
                System.out.println(this.getName()+" "+i);
        }
    }
}

class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<=100; i++){
            if (i%2!=0)
                System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread t2 = new Thread(new Thread2());
        t2.start();

    }

}
