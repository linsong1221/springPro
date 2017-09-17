package com.song.crudTest.controller;

import com.song.crudTest.dao.DepartmentDao;
import com.song.crudTest.dao.EmployeeDao;
import com.song.crudTest.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/emps")
    public String list(Map<String,Object> map){
        map.put("employees",employeeDao.getAll());
        return "list";
    }

    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping(value = "/emp",method= RequestMethod.GET)
    public String input(Map<String,Object> map){
        map.put("departments",departmentDao.getDepartments());
        map.put("employee",new Employee());
        return "input";
    }
    @RequestMapping(value = "/linsong")
    public String save(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }
}
