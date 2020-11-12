package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ControllerTest2
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/28 18:11
 */
@Controller
//@Controller注解的类会自动添加到Spring上下文中
public class ControllerTest2 {

    //映射访问路径
    @RequestMapping("/t1")
    public String index(Model model) {
        //Spring  MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "TestController");
        //返回视图位置
        return "test";
    }

}
