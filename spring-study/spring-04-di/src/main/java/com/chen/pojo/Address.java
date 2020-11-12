package com.chen.pojo;

/**
 * @ClassName Address
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/15 15:38
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
