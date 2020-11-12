package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName EncodingController
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/29 17:06
 */
@Controller
public class EncodingController {
    @PostMapping("/encoding/t1")
    public String test1(String name, Model model) {
        System.out.println(name);
        model.addAttribute("msg", name);
        return "test";
    }

}
