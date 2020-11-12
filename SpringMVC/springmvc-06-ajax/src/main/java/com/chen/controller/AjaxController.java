package com.chen.controller;

import com.chen.pojo.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AjaxController
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/11/3 16:49
 */
@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test() {
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("param=>" + name);
        if ("xiaochen".equals(name)) {
            response.getWriter().write("true");
        } else {
            response.getWriter().write("false");
        }
    }

    @RequestMapping("/a2")
    public List a2() {
        List<User> userList = new ArrayList<User>();

        //添加数据
        userList.add(new User(1, "小陈", "男"));
        userList.add(new User(1, "小红", "男"));
        userList.add(new User(1, "小黄", "男"));

        return userList;
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd) {
        String msg = "";
        if ("admin".equals(name)) {
            msg = "ok";
        } else {
            msg = "用户名有误";
        }

        if (pwd != null) {
            if ("123456".equals(pwd)) {
                msg = "ok";
            } else {
                msg = "密码有误";
            }
        }
        return msg;
    }
}
