import com.chen.dao.UserMapper;
import com.chen.pojo.User;
import com.chen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/11 16:24
 */
public class MyTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        System.out.println("=========================");

        //mapper.updateUserById(new User(3,"xiaohua","123"));
        sqlSession.clearCache();
        User userById2 = mapper.getUserById(1);
        System.out.println(userById2);
        System.out.println(userById == userById2);
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();


        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User userById2 = mapper2.getUserById(1);
        System.out.println(userById2);
        System.out.println(userById==userById2);
        sqlSession2.close();


    }
}
