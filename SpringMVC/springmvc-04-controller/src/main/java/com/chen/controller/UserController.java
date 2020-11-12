package com.chen.controller;

import com.chen.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/29 16:26
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public String test1(String name) {
        System.out.println(name);
        return "test";
    }

    @GetMapping("/t2")
    public String test2(User user) {
        System.out.println(user);
        return "test";
    }
}
