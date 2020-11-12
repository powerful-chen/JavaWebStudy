package com.chen.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.chen.pojo.User;
import com.chen.utlis.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/31 8:10
 */
@Controller
public class UserController {

    @RequestMapping("/j1")
    @ResponseBody
    public String josn1() throws JsonProcessingException {
        User user = new User("小陈", 18, "男");
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("/j2")
    @ResponseBody
    public String josn2() throws JsonProcessingException {

        List<User> list = new ArrayList<User>();

        User user1 = new User("小陈1", 18, "男");
        User user2 = new User("小陈2", 18, "男");
        User user3 = new User("小陈3", 18, "男");
        User user4 = new User("小陈4", 18, "男");

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(list);
        return str;
    }

    @RequestMapping("/j3")
    @ResponseBody
    public String josn3() throws JsonProcessingException {

        Date date = new Date();

        return JsonUtils.getJson(date, "yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping("/j4")
    @ResponseBody
    public String josn4() throws JsonProcessingException {

        //创建一个对象
        User user1 = new User("秦疆1号", 3, "男");
        User user2 = new User("秦疆2号", 3, "男");
        User user3 = new User("秦疆3号", 3, "男");
        User user4 = new User("秦疆4号", 3, "男");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        System.out.println("*******Java对象  转  JSON字符串*******");
        String str1 = JSON.toJSONString(list);
        System.out.println("JSON.toJSONString(list)==>" + str1);
        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>" + str2);

        System.out.println("\n******  JSON字符串  转  Java对象*******");
        User jp_user1 = JSON.parseObject(str2, User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>" + jp_user1);

        System.out.println("\n******  Java对象  转  JSON对象  ******");
        JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject)JSON.toJSON(user2) == > "+jsonObject1.getString("name"));
        System.out.println("\n******  JSON对象  转  Java对象  ******");
        User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1,User.class) ==>"+to_java_user);

        return "hello";
    }
}
