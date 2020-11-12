package com.chen.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @ClassName IDutils
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/10 21:10
 */
public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(IDutils.getId());
    }
}
