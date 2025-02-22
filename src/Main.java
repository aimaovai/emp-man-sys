package src;

public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company();

        // Creating employees
        FullTimeEmployee emp1 = new FullTimeEmployee(3, "Alice Johnson", "Engineering", 80000, 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee(1, "Bob Smith", "Marketing", 25, 20);
        FullTimeEmployee emp3 = new FullTimeEmployee(2, "Charlie Brown", "Engineering", 75000, 4000);

        // Adding employees
        myCompany.addEmployee(emp1);
        myCompany.addEmployee(emp2);
        myCompany.addEmployee(emp3);

        // Display all employees (Sorted)
        myCompany.displayAllEmployees();

        // Display employees by department
        myCompany.displayEmployeesByDepartment();

        // Remove an employee and display updated list
        myCompany.removeEmployee(2);
        myCompany.displayAllEmployees();
    }
}
