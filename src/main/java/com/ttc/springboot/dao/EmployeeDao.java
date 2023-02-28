package com.ttc.springboot.dao;

import com.ttc.springboot.pojo.Department;
import com.ttc.springboot.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Sagrtc
 * @date 2021/12/10 - 13:59
 */
@Repository
public class EmployeeDao {
    //模拟数据库
    private static Map<Integer, Employee> employeeMap=null;//创建一个员工表

    @Autowired
    private  DepartmentDao departmentDao;
    static {
        employeeMap=new HashMap<>();
        employeeMap.put(1001,new Employee(1001,"ttc","Sgartc@163.com",0,new Department(101,"教学部1")));
        employeeMap.put(1002,new Employee(1002,"ttc1","Sgartc@163.com",1,new Department(102,"教学部2")));
        employeeMap.put(1003,new Employee(1003,"ttc2","Sgartc@163.com",0,new Department(103,"教学部3")));
        employeeMap.put(1004,new Employee(1004,"ttc3","Sgartc@163.com",1,new Department(104,"教学部4")));
        employeeMap.put(1005,new Employee(1005,"ttc4","Sgartc@163.com",0,new Department(105,"教学部5")));
    }

    //主键ID
    private static Integer initid=1006;
    //增加员工
    public void insertEmployer(Employee employee){
        if(employee.getId()==null){
            employee.setId(initid++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employeeMap.put(employee.getId(),employee);
        System.out.println("全部的部门："+employeeMap.values());
    }
    //查询全部员工
    public Collection<Employee> getAll(){
        return employeeMap.values();
    }

    //通过id查询员工
    public Employee getEmployerById(Integer id){
        return employeeMap.get(id);
    }
    //删除员工
    public void delete(Integer id){
        employeeMap.remove(id);
    }
}
