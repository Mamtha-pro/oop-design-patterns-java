package employeepayrollsystem;

public class FullTimeEmployee implements Employee {
    public double monthlySalary;
    public double  bonus;

    public FullTimeEmployee(double monthlySalary, double  bonus) {
        this.monthlySalary = monthlySalary;
        this. bonus =  bonus;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary *  bonus;
    }
}
