public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlySalary;

    PartTimeEmployee(String employeeName, int employeeId, int hoursWorked, double hourlySalary) {
        super(employeeName, employeeId);
        this.hoursWorked = hoursWorked;
        this.hourlySalary = hourlySalary;
    }

    @Override
    public double calculatedSalary() {
        return hourlySalary * hoursWorked;
    }

    @Override
    public void creditSalary() {
        System.out.println("Salary Credited to " + this.getEmployeeName() + ". Rupees: " + this.calculatedSalary());
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public double getHourlySalary() {
        return this.hourlySalary;
    }


}

