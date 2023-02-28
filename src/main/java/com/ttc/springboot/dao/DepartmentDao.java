package com.ttc.springboot.dao;

import com.sun.javafx.collections.MappingChange;
import com.ttc.springboot.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Sagrtc
 * @date 2021/12/10 - 13:47
 */
//部门dao
@Repository
public class DepartmentDao {
    //模拟数据库
    private static Map<Integer, Department> departmentMap=null;//创建一个部门表

    static {
        departmentMap=new HashMap<>();
        departmentMap.put(101,new Department(101,"教学部1"));
        departmentMap.put(102,new Department(102,"教学部2"));
        departmentMap.put(103,new Department(103,"教学部3"));
        departmentMap.put(104,new Department(104,"教学部4"));
        departmentMap.put(105,new Department(105,"教学部5"));
    }

    //获得所有部门信息
    public Collection<Department> getDepartments(){
        return departmentMap.values();
    }

    //通过id得到部门信息
    public Department getDepartmentById(Integer id){
        return departmentMap.get(id);
    }
}
