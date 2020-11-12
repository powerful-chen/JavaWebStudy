package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/11/10 16:27
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("goLogin")
    public String goLogin() {
        return "login";
    }

    @RequestMapping("main")
    public String main() {
        return "main";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model) {

        System.out.println("login===>" + username);
        //把用户的信息存在session中
        session.setAttribute("userLoginInfo", username);
        model.addAttribute("username",username);
        return "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session) {

        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
