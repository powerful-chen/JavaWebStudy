package com.chen.pojo;

import lombok.Data;

/**
 * @ClassName Student
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/10 9:12
 */
@Data
public class Student {
    private int id;
    private String name;

    private Teacher teacher;
}
