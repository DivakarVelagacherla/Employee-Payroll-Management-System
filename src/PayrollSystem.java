import java.util.ArrayList;

public class PayrollSystem {
    ArrayList<Employee> employeeList;

    PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public void removeEmployee(int employeeId) {
        for (Employee emp : employeeList) {
            if (emp.getId() == employeeId) {
                employeeList.remove(emp);
                break;
            }
        }
    }

    public void runPayroll() {
        for (Employee emp : employeeList) {
            emp.creditSalary();
        }
    }

    public void getEmployeeList() {
        if (employeeList.isEmpty()) {
            System.out.println("No Employees");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }
    }

}
