package com.chen.pojo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/10 9:11
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
