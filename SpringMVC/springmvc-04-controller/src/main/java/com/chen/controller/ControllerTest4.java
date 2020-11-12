package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName ControllerTest4
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/28 21:29
 */
@Controller
public class ControllerTest4 {
    @GetMapping("/rsm/t1")
    public String test1(Model model) {
        model.addAttribute("msg", "ControllerTest4");
        //转发
        return "/index.jsp";
    }

    @GetMapping("/rsm/t2")
    public String test2(Model model) {
        model.addAttribute("msg", "ControllerTest4");
        return "forward:/index.jsp";
    }

    @GetMapping("/rsm/t3")
    public String test3(Model model) {
        model.addAttribute("msg", "ControllerTest4");
        //重定向
        return "redirect:/index.jsp";
    }
}
