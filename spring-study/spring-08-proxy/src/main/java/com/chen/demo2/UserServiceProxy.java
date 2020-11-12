package com.chen.demo2;

/**
 * @ClassName UserServiceProxy
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/18 8:48
 */
public class UserServiceProxy implements UserService{

    private UserServiceImpl userServiceImpl;

    public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    public void add() {
        log("add");
        userServiceImpl.add();
    }

    public void delete() {
        log("delete");
        userServiceImpl.delete();
    }

    public void update() {
        log("update");
        userServiceImpl.update();
    }

    public void query() {
        log("query");
        userServiceImpl.query();
    }
    public void log(String msg){
        System.out.println("【Debug】"+msg+"了一个用户");
    }
}
