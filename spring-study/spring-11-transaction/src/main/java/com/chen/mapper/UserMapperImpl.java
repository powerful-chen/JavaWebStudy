package com.chen.mapper;

import com.chen.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @ClassName UserMapperImpl
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/19 14:19
 */
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    //我们的所有操作，都使用SqlSession来执行，在原来，现在都使用 SqlSessionTemplate
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {

        User user = new User(5, "test", "123456789");

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(user);

        mapper.deleteUser(4);

        return mapper.selectUser();
    }

    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUser(id);
    }
}
