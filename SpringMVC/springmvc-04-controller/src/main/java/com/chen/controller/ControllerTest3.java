package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName ControllerTest3
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/28 20:57
 */
@Controller
public class ControllerTest3 {
    @GetMapping(value = "/t1/{a}/{b}")
    public String test01(@PathVariable int a, @PathVariable String b, Model model) {
        String result = a + b;
        model.addAttribute("msg", result);
        return "test";
    }
}
