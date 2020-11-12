package com.chen.dao;

import com.chen.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    // 分页
    List<User> getUserByLimit(Map<String, Integer> map);
}
