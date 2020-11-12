package com.chen.dao;

import com.chen.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User getUserById(@Param("id") int id);

    int updateUserById(User user);

}
