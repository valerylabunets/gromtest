package lesson10.abstractbigexample;

public class EmployeeContoller {
    private Employee[] employees = new Employee[100];

    void paySalaryToEmployees() {
        for (Employee employee: employees) {
            employee.paySalary();
            System.out.println("Salary was paid successfully to " + employee.getName() + "employee");
        }
    }
}
