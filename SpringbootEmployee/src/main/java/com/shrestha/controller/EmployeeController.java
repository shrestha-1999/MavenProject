package com.shrestha.controller;
import com.shrestha.model.Employee;
import com.shrestha.repository.EmployeeRepo;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
public class EmployeeController {
    private final EmployeeRepo repo;
    @Autowired
    public EmployeeController(EmployeeRepo repo) {
        this.repo = repo;
    }
    @PostMapping("/employees")
    public int addEmployee(@RequestBody Employee employee) {
        return repo.addEmployee(employee);

    }
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {

        return repo.getEmployeeById(id);
    }
}
