package com.ttc.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Sagrtc  员工表
 * @date 2021/12/10 - 13:43
 */
@Data
@NoArgsConstructor

public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;//0:女,1:男
    private Department department;//部门
    private Date birth;

    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }
}
