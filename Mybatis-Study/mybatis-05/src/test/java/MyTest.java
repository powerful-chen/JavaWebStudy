import com.chen.dao.BlogMapper;
import com.chen.pojo.Blog;
import com.chen.utils.IDutils;
import com.chen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/10 21:09
 */
public class MyTest {

    @Test
    public void addBlogTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Java");
        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring");
        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("微服务");
        mapper.addBook(blog);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test02() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        //map.put("title", "Mybatis");
        map.put("author", "狂神说");
        List<Blog> blogs = mapper.queryBlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void test03() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        //map.put("title", "Mybatis");
        map.put("author", "狂神说");
        map.put("views", "9999");
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void test04() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title", "Mybatis");
        map.put("author", "狂神说1");
        map.put("id", "491b5e731af8440994df15e078e811e6");
        mapper.UpdateBlog(map);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test05() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();

        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        map.put("ids", ids);

        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }


}
