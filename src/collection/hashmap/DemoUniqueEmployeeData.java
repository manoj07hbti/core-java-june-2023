package collection.hashmap;

import collection.model.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DemoUniqueEmployeeData {

    public HashMap<String, HashSet<Employee>> dataEmp() {
        HashMap<String, HashSet<Employee>> empData = new HashMap<>();
        // HashSet<Employee> employees=new HashSet<>();
        Employee employee1 = new Employee("A21", "Shreya", 28, 60000,"TCS");
        Employee employee2 = new Employee("A22", "Sukhad", 27, 43000,"TCS");
        Employee employee3 = new Employee("A23", "Sachin", 30, 85000,"IBM");
        Employee employee4 = new Employee("A24", "Chiku", 28, 48000,"TCS");
        Employee employee5 = new Employee("A25", "Sharad", 27, 43000,"INFSYS");
        Employee employee6 = new Employee("A23", "Sachin", 30, 85000,"IBM");
        Employee employee7 = new Employee("A21", "Shreya", 28, 60000,"TCS");
        Employee employee8 = new Employee("A26", "Ankit", 27, 47000,"INFSYS");
        Employee employee9 = new Employee("A24", "Chiku", 28, 48000,"TCS");
        Employee employee10 = new Employee("A21", "Shreya", 28, 60000,"TCS");
        Employee employee14 = new Employee("A22", "Sukhad", 27, 43000,"TCS");
        Employee employee15 = new Employee("A23", "Sachin", 30, 85000,"IBM");
        Employee employee11 = new Employee("A24", "Chiku", 28, 48000,"TCS");
        Employee employee12 = new Employee("A22", "Sukhad", 27, 43000,"TCS");
        Employee employee13 = new Employee("A25", "Sharad", 27, 43000,"INFSYS");
        Employee employee16 = new Employee("A26", "Sachin", 30, 85000,"INFSYS");
        Employee employee17 = new Employee("A27", "Shreya", 28, 60000,"IBM");
        Employee employee18 = new Employee("A28", "nkita", 27, 77000,"INFSYS");
        Employee employee19 = new Employee("A29", "Chiku", 28, 40000,"IBM");
        Employee employee20 = new Employee("A30", "Shreya", 28, 60000,"INFSYS");

        HashSet<Employee> employees = new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);
        employees.add(employee11);
        employees.add(employee12);
        employees.add(employee13);
        employees.add(employee14);
        employees.add(employee15);
        employees.add(employee16);


        employees.add(employee17);
        employees.add(employee18);
        employees.add(employee19);
        employees.add(employee20);
        empData.put("emp",employees);

        return empData;
    }








    public static void main(String[] args) {
        DemoUniqueEmployeeData obj = new DemoUniqueEmployeeData();
        HashMap<String, HashSet<Employee>> map1 = obj.dataEmp();
      //  HashMap<String, HashSet<Employee>> map2 = obj.dataEmp1();

        Set<Employee> employeeSet = map1.get("emp");
       // Set<Employee> employeeSet1 = map2.get("IBM");

        for (Employee var : employeeSet) {
            //String companyName= var.getCompanyName();
            if (("TCS".equalsIgnoreCase(var.getCompanyName()) || "INFSYS".equalsIgnoreCase(var.getCompanyName())) && (45000< var.getSal())){
                System.out.println(var.getEmpId() +" "+var.getEmpName()+" "+var.getSal()+" "+var.getCompanyName());
            }
        }
        }
    }

