package com.chen.service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/18 15:09
 */
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("添加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("更新了一个用户");
    }

    public void select() {
        System.out.println("查询了一个用户");
    }
}
