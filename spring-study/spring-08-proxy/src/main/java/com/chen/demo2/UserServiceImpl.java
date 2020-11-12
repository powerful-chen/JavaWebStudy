package com.chen.demo2;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/18 8:47
 */
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("add了一个用户");
    }

    public void delete() {
        System.out.println("delete了一个用户");
    }

    public void update() {
        System.out.println("update了一个用户");
    }

    public void query() {
        System.out.println("query了一个用户");
    }
}
