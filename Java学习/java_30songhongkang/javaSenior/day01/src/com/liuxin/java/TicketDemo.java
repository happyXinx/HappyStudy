package javaSenior.day01.src.com.liuxin.java;

class Ticket implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            synchronized (this){
                if(ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" "+ticket--);
                }else {
                    break;
                }
            }
        }
    }
}

public class TicketDemo {

    public static void main(String[] args) {
        Ticket t = new Ticket();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.setName("window1");
        t2.setName("window2");
        t3.setName("window3");

        t1.start();
        t2.start();
        t3.start();

    }
}
