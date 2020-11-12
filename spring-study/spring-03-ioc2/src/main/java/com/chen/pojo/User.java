package com.chen.pojo;

/**
 * @ClassName User
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/14 8:46
 */
public class User {
    private String name;

    // 第一种方式
    /*public User() {
        System.out.println("使用User无参构造");
    }*/

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
