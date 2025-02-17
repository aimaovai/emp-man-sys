package src;

public class FullTimeEmployee extends Employee {
    private double annualBonus;

    public FullTimeEmployee(int id, String name, String department, double salary, double annualBonus) {
        super(id, name, department, salary);
        this.annualBonus = annualBonus;
    }

    public double getAnnualBonus() { return annualBonus; }
    public void setAnnualBonus(double annualBonus) { this.annualBonus = annualBonus; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Annual Bonus: $" + annualBonus);
    }
}
