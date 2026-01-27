package employeepayrollsystem;

public class EmployeePayroll {

    public static void main(String[] args) {

        Employee partEmp = new PartTimeEmployee(900, 283);
        System.out.println("Part-time Salary: " + partEmp.calculateSalary());

        Employee fullEmp = new FullTimeEmployee(100, 20);
        System.out.println("Full-time Salary: " + fullEmp.calculateSalary());
    }
}

