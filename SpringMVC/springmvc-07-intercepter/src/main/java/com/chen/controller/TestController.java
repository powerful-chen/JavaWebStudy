package com.chen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/11/10 15:52
 */

@RestController
public class TestController {

    @RequestMapping("/t1")
    public String test() {
        System.out.println("TestController==> test()执行了");
        return "OK";
    }
}
