package com.liuxin.interfaceTest;

public class UsbTest {

    public static void main(String[] args) {
        Computer c=new Computer();
        c.transferData(new Flash());

        //创建接口的匿名实现类的匿名对象
        c.transferData(new Usb() {
            @Override
            public void start() {
                System.out.println("手机开始");
            }

            @Override
            public void end() {
                System.out.println("手机结束");
            }
        });
    }
}

interface Usb{

    void start();
    void end();
}

class Computer{
    public void transferData(Usb usb){
        usb.start();
        System.out.println("开始传输");
        usb.end();
    }
}

class Flash implements Usb{

    @Override
    public void start() {
        System.out.println("插上");
    }

    @Override
    public void end() {
        System.out.println("拔掉");
    }
}
