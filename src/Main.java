import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PayrollSystem payroll = new PayrollSystem();
        Scanner sc = new Scanner(System.in);


        boolean payrollSystem = true;

        while (payrollSystem) {
            System.out.println("Employee Payroll System \n 1.Add Employee \n 2.Delete Employee \n 3.Run Payroll \n 4.List Employees \n 5.Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter employee type: \n1.Full Time\n2.Part Time");
                    int employeeType = sc.nextInt();
                    if (employeeType == 1) {
                        System.out.println("Enter employee name:");
                        String employeeName = sc.next();
                        System.out.println("Enter employee id:");
                        int employeeId = sc.nextInt();
                        System.out.println("Enter employee Salary:");
                        double employeeSalary = sc.nextDouble();
                        Employee newEmployee = new FullTimeEmployee(employeeName, employeeId, employeeSalary);
                        payroll.addEmployee(newEmployee);
                        System.out.println("Employee added: " + employeeName);
                    } else {
                        System.out.println("Enter employee name:");
                        String employeeName = sc.next();
                        System.out.println("Enter employee id:");
                        int employeeId = sc.nextInt();
                        System.out.println("Enter employee hourly salary:");
                        double hourlySalary = sc.nextDouble();
                        System.out.println("Enter hours worked:");
                        int hoursWorked = sc.nextInt();

                        Employee newEmployee = new PartTimeEmployee(employeeName, employeeId, hoursWorked, hourlySalary);
                        payroll.addEmployee(newEmployee);
                        System.out.println("Employee added: " + employeeName);
                    }
                    break;
                case 2:
                    System.out.println("Enter the ID of the employee to delete");
                    int employeeIdToDelete = sc.nextInt();
                    payroll.removeEmployee(employeeIdToDelete);
                    System.out.println("Employee removed");
                    break;

                case 3:
                    System.out.println("Running payroll....");
                    payroll.runPayroll();
                    break;

                case 4:
                    System.out.println("Listing all Employees:");
                    payroll.getEmployeeList();
                    break;

                case 5:
                    payrollSystem = false;
                    break;

                default:
                    break;
            }
        }
    }
}