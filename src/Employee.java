abstract class Employee {
    private String employeeName;
    private int employeeId;
    private double employeeSalary;

    Employee(String employeeName, int employeeId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    abstract public double calculatedSalary();

    public int getId() {
        return this.employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    abstract public void creditSalary();

    @Override
    public String toString() {
        return "Employee{" + "employeeName='" + employeeName + '\'' + ", employeeId=" + employeeId + '}';
    }
}
