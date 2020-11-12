package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/23 9:31
 */

@Controller
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello,SpringMVCAnnotation");
        return "hello";//会被视图解析器处理
    }
}
