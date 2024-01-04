package com.shrestha.Repository;

import com.shrestha.model.Employee;
import com.shrestha.repository.EmployeeRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepoTest {
    EmployeeRepo repo = new EmployeeRepo();

    @Test
    void TestAddEmployee() {

        Employee employee = new Employee("John Doe", 30);
        int result = repo.addEmployee(employee);
        assertEquals(0, result);
        assertEquals(0, employee.getId());
    }

    @Test
    void TestGetEmployeeById() {
        Employee sampleEmployee = new Employee("John Doe", 30);
        repo.addEmployee(sampleEmployee);
        Employee getEmp = repo.getEmployeeById(0);
        assertEquals("John Doe",getEmp.getName());
        assertEquals(30, getEmp.getAge());
    }


}
