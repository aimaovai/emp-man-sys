package src;

public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company();

        // Creating employees
        FullTimeEmployee emp1 = new FullTimeEmployee(1, "Alice Johnson", "Engineering", 80000, 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee(2, "Bob Smith", "Marketing", 25, 20);
        
        // Adding employees to the company
        myCompany.addEmployee(emp1);
        myCompany.addEmployee(emp2);
        
        // Displaying all employees
        myCompany.displayAllEmployees();
        
        // Removing an employee
        myCompany.removeEmployee(2);
        
        // Displaying remaining employees
        myCompany.displayAllEmployees();
    }
}
