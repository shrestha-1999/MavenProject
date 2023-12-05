package com.shrestha.repository;
import com.shrestha.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class EmployeeRepo {
    private static ArrayList<Employee> employees;
    private EmployeeRepo(){
        employees = new ArrayList<>();
    }
    public int addEmployee(Employee e1) {
        employees.add(e1);
        int id = employees.indexOf(e1);
        e1.setId(id);
        return e1.getId();
    }

    public Employee getEmployeeById(int id) {
        if (id >= 0 && id < employees.size()) {
            return employees.get(id);
        }
        return null; // Employee not found
    }
}

