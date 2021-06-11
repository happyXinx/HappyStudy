package com.liuxin.interfaceTest;

/*
* 代理模式
*
*
 */

public class NetWorkTest {
    public static void main(String[] args) {
        Server server=new Server();
        ProxyServer p=new ProxyServer(server);
        p.browse();
    }
}

interface Network{
    public void browse();
}

//被代理类
class Server implements Network{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

//代理类
class ProxyServer implements Network{

    private Network work;

    public ProxyServer(Network work){
        this.work=work;
    }

    public void check(){
        System.out.println("检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }


}


