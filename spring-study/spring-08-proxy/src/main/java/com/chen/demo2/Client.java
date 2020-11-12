package com.chen.demo2;

/**
 * @ClassName Client
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/18 8:52
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserServiceImpl(userService);

        proxy.query();
    }
}
