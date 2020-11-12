package com.chen.dao;

import com.chen.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @ClassName BlogMapper
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/10 21:06
 */
public interface BlogMapper {

    //插入数据
    int addBook(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);


    List<Blog> queryBlogChoose(Map map);

    //更新博客
    int UpdateBlog(Map map);

    //查询第1-2-3号记录的博客
    List<Blog> queryBlogForeach(Map map);


}
