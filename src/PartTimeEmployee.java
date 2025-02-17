package src;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, String department, double hourlyRate, int hoursWorked) {
        super(id, name, department, hourlyRate * hoursWorked);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() { return hoursWorked; }
    public double getHourlyRate() { return hourlyRate; }

    public void setHoursWorked(int hoursWorked) { 
        this.hoursWorked = hoursWorked; 
        setSalary(hourlyRate * hoursWorked);  // Update salary dynamically
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hourly Rate: $" + hourlyRate + ", Hours Worked: " + hoursWorked);
    }
}
