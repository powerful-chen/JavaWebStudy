package com.chen.demo1;

/**
 * @ClassName Client
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/18 8:25
 */
public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //代理，中介帮房东租房子，代理一般会有附属操作
        Proxy proxy = new Proxy(host);
        //直接调用中介的接口
        proxy.rent();
    }
}
