package com.chen.demo3;

/**
 * @ClassName Client
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/18 14:19
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(host);
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();
    }
}
