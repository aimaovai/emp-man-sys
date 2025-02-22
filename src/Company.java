package src;

import java.util.*;

public class Company {
    private TreeSet<Employee> employees;
    private HashMap<String, List<Employee>> departmentMap;

    public Company() {
        employees = new TreeSet<>();
        departmentMap = new HashMap<>();
    }

    // Add an employee (sorted automatically)
    public void addEmployee(Employee employee) {
        employees.add(employee);

        // Add to department map
        departmentMap.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        
        System.out.println("Employee added: " + employee.getName());
    }

    // Remove an employee by ID
    public void removeEmployee(int id) {
        Employee toRemove = null;
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                toRemove = emp;
                break;
            }
        }
        if (toRemove != null) {
            employees.remove(toRemove);
            departmentMap.get(toRemove.getDepartment()).remove(toRemove);
            System.out.println("Employee with ID " + id + " removed.");
        }
    }

    // Display all employees (Sorted)
    public void displayAllEmployees() {
        System.out.println("\n--- Employee List (Sorted by ID) ---");
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("-------------------");
        }
    }

    // Display employees grouped by department
    public void displayEmployeesByDepartment() {
        System.out.println("\n--- Employees Grouped by Department ---");
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            for (Employee emp : entry.getValue()) {
                emp.displayInfo();
            }
            System.out.println("-------------------");
        }
    }
}
