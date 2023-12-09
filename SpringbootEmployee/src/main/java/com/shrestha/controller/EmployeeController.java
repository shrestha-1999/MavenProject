package com.shrestha.controller;
import com.shrestha.exception.IdNotFoundException;
import com.shrestha.model.Employee;
import com.shrestha.repository.EmployeeRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") int id) {

        Employee employee = repo.getEmployeeById(id);

        if (employee == null) {
            throw new IdNotFoundException("Employee with id " + id + " not found");
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
