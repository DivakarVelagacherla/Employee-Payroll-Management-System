public class FullTimeEmployee extends Employee {

    private double employeeSalary;

    FullTimeEmployee(String employeeName, int employeeId, double employeeSalary) {
        super(employeeName, employeeId);
        this.employeeSalary = employeeSalary;
    }

    @Override
    public double calculatedSalary() {
        return employeeSalary;
    }

    @Override
    public void creditSalary() {
        System.out.println("Salary Credited to " + this.getEmployeeName() + ". Rupees: " + this.calculatedSalary());
    }

    public double getEmployeeSalary() {
        return this.employeeSalary;
    }
}
