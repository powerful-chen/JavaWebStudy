package com.chen.demo1;

/**
 * @ClassName Proxy
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/18 8:25
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    public void hetong() {
        System.out.println("签租赁合同");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}
