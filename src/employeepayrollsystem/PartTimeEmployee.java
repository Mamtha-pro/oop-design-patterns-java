package employeepayrollsystem;

public class PartTimeEmployee implements Employee {
   public  double hourlyRate;
   public double hoursWorked;

    public PartTimeEmployee(double hourlyRate, double hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate + hoursWorked;
    }
}
