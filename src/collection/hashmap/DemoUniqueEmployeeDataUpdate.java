package collection.hashmap;

import collection.model.Employee;

import java.util.HashMap;
import java.util.HashSet;

public class  DemoUniqueEmployeeDataUpdate {


    public void empData(){

        HashMap<String, HashSet<Employee>> tcsEmp=new HashMap<>();
        Employee employee1=new Employee("A1","Anshu",27,74123.96,"TCS");
        Employee employee2=new Employee("A2","Janvhi",27,74123.96,"TCS");
        Employee employee3=new Employee("A3","Rahim",27,74123.96,"TCS");
        Employee employee4=new Employee("A4","Akshata",27,74123.96, "TCS");
        HashSet<Employee> employees=new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);



    }
}
