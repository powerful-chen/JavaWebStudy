package com.chen.diy;

/**
 * @ClassName DiyPointCut
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/18 16:30
 */
public class DiyPointCut {
    public void before(){
        System.out.println("============方法执行前==============");
    }
    public void after(){
        System.out.println("============方法执行后==============");
    }
}
