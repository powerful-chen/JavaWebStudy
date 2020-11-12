package com.chen.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Blog
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/10 21:05
 */

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
