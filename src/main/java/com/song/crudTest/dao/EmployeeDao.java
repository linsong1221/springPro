package com.song.crudTest.dao;

import com.song.crudTest.entities.Department;
import com.song.crudTest.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {

    private static Map<Integer,Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;


    static {
        employees = new HashMap<Integer, Employee>();

        employees.put(101, new Employee(1001, "E-AA","aa@163.com",1,new Department(101, "D-AA")));
        employees.put(102, new Employee(1002, "E-BB","aa@163.com",1,new Department(101, "D-AA")));
        employees.put(103, new Employee(1003, "E-CC","aa@163.com",1,new Department(101, "D-AA")));
        employees.put(104, new Employee(1004, "E-DD","aa@163.com",1,new Department(101, "D-AA")));
        employees.put(105, new Employee(1005, "E-EE","aa@163.com",1,new Department(101, "D-AA")));
    }

    private static Integer InitId = 1006;

    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(InitId++);
        }
        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }

    public Collection<Employee> getAll(){
        return employees.values();
    }

    public Employee get(Integer id){
        return employees.get(id);
    }
    public void delete(Integer id){
        employees.remove(id);
    }
}
