package Collection.Model;

public class Employee {
    String Employee_Name;
    int EmployeeId;
    String Employee_Job_Role;
    double Employee_Salary;

    public Employee(String employee_Name, int employeeId, String employee_Job_Role, double employee_Salary) {
        Employee_Name = employee_Name;
        EmployeeId = employeeId;
        Employee_Job_Role = employee_Job_Role;
        Employee_Salary = employee_Salary;
    }

    public String getEmployee_Name() {
        return Employee_Name;
    }

    public void setEmployee_Name(String employee_Name) {
        Employee_Name = employee_Name;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployee_Job_Role() {
        return Employee_Job_Role;
    }

    public void setEmployee_Job_Role(String employee_Job_Role) {
        Employee_Job_Role = employee_Job_Role;
    }

    public double getEmployee_Salary() {
        return Employee_Salary;
    }

    public void setEmployee_Salary(double employee_Salary) {
        Employee_Salary = employee_Salary;
    }
}
