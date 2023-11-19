package collection.hashmap;

import collection.model.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MyUniqueEmployee {

    public HashMap<String, HashSet<Employee>> createUniqueData() {

        HashMap<String, HashSet<Employee>> employeesMap = new HashMap<>();


        // We need data of Employee:


        Employee employee1 = new Employee("IBM", "Deepak", "2325ch", 58000.0);
        Employee employee2 = new Employee("IBM", "Deepak", "2325ch", 58000.0);
        Employee employee3 = new Employee("IBM", "Anupam", "2325ch", 60000.0);
        Employee employee4 = new Employee("IBM", "Anupam", "2325ch", 60000.0);
        Employee employee5 = new Employee("IBM", "Aman", "5345ch,", 52000.0);
        Employee employee6 = new Employee("IBM", "Aman", "5345ch", 52000.0);
        Employee employee7 = new Employee("IBM", "Rahul", "2375ch", 42000.0);
        Employee employee8 = new Employee("IBM", "Rahul", "2375ch", 42000.0);
        Employee employee9 = new Employee("IBM", "Dev", "1345ch", 44000.0);
        Employee employee10 = new Employee("IBM", "Dev", "1345ch", 44000.0);

        // We need to create Hashset:

        HashSet<Employee> employeeHashSet = new HashSet<>();

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);
        employeeHashSet.add(employee7);
        employeeHashSet.add(employee8);
        employeeHashSet.add(employee9);
        employeeHashSet.add(employee10);

        employeesMap.put("IBM", employeeHashSet);

        return employeesMap;
        
    }
    public void createUniqueEmployeeData(){
        HashMap<String, HashSet<Employee>> employeesMap1 = new HashMap<>();

        // We need data of Employee:

        Employee employee11 = new Employee("TCS", "Deepak", "2325ch", 58000.0);
        Employee employee12 = new Employee("TCS", "Deepak", "2325ch", 58000.0);
        Employee employee13 = new Employee("TCS", "Anupam", "2325ch", 60000.0);
        Employee employee14 = new Employee("TCS", "Anupam", "2325ch", 60000.0);
        Employee employee15 = new Employee("TCS", "Aman", "5345ch,", 52000.0);
        Employee employee16 = new Employee("TCS", "Aman", "5345ch", 52000.0);
        Employee employee17 = new Employee("TCS", "Rahul", "2375ch", 42000.0);
        Employee employee18 = new Employee("TCS", "Rahul", "2375ch", 42000.0);
        Employee employee19 = new Employee("TCS", "Dev", "1345ch", 44000.0);
        Employee employee20 = new Employee("TCS", "Dev", "1345ch", 44000.0);

        // We need to create hashset:

        HashSet<Employee> employeeHashSet = new HashSet<>();
    }


    public static void main(String [] args ){
        MyUniqueEmployee Obj = new MyUniqueEmployee();

       HashMap<String,HashSet<Employee>> map = Obj.createUniqueData();


        Set<Employee>employeeSet = map.get("IBM");



        for (Employee var: employeeSet){
            System.out.println(" Company : "+var.getCompany()+" Name: "+var.getName()+" ID: "+var.getID()+" salary: "+var.getSalary());
        }
    }
}
