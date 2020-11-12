package com.chen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/17 10:34
 */

//@Component 组件
@Component
public class User {
    @Value("小陈")
    public String name;
}
