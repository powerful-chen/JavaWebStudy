package com.chen.pojo;

/**
 * @ClassName Hello
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/14 7:46
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
