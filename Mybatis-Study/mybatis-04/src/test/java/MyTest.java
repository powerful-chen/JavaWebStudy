import com.chen.dao.TeacherMapper;
import com.chen.pojo.Teacher;
import com.chen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/10 16:10
 */
public class MyTest {

    @Test
    public void Test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher2(1);
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }
        sqlSession.close();
    }
}
