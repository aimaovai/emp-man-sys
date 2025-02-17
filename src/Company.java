package src;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getName());
    }

    // Remove an employee by ID
    public void removeEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
        System.out.println("Employee with ID " + id + " removed.");
    }

    // Display all employees
    public void displayAllEmployees() {
        System.out.println("\n--- Employee List ---");
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("-------------------");
        }
    }
}
