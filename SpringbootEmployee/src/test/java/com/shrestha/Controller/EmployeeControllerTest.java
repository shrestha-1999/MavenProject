 package com.shrestha.Controller;
import com.shrestha.controller.EmployeeController;
import com.shrestha.model.Employee;
import com.shrestha.repository.EmployeeRepo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EmployeeControllerTest {
    EmployeeRepo repo = new EmployeeRepo();
    @Test
       public void TestAddEmployee() {

            EmployeeController controller = new EmployeeController(repo);

            Employee employee = new Employee("Shrestha", 25);

            int id = controller.addEmployee(employee);

            assertEquals(0, id);
        }

    @Test
    void TestGetEmployee() {
        EmployeeRepo repo = new EmployeeRepo();
        EmployeeController controller = new EmployeeController(repo);

        Employee employee = new Employee("Debu", 26);

        int id = controller.addEmployee(employee);
        Employee getEmp = controller.getEmployee(id).getBody();

        assertEquals(employee, getEmp);
    }
    
    }
    
