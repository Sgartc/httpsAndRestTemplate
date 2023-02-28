package com.ttc.springboot.controller;

import com.ttc.springboot.dao.EmployeeDao;
import com.ttc.springboot.pojo.Department;
import com.ttc.springboot.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

/**
 * @Sagrtc
 * @date 2021/12/10 - 18:06
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees=employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emps/list";
    }
    @RequestMapping("/emp")
    public String addEmployee(@RequestParam("name") String name,@RequestParam("department") String departmentId){
        Department department=new Department();
        department.setId(Integer.parseInt(departmentId));
        Employee employee=new Employee();
        employee.setLastName(name);
        employee.setDepartment(department);
        System.out.println(employee);
       employeeDao.insertEmployer(employee);

        return "emps/list";
    }
}
