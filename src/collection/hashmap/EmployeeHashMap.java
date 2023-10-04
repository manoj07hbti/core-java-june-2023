package collection.hashmap;

import collection.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeHashMap {

    public void createEmployeeData()
    {
        HashMap<String, ArrayList<Employee>> empData=new HashMap<>();
        ArrayList<Employee> ibmEmployees=new ArrayList<>();
      Employee employee1=new Employee("A21","Rahu",30,78536.52);
        Employee employee2=new Employee("A22","shubham",28,78536.52);
        Employee employee3=new Employee("A23","Shreya",35,78536.52);
        Employee employee4=new Employee("A24","Sidhi",50,78536.52);
        Employee employee5=new Employee("A25","Rinku",40,78536.52);
        Employee employee6=new Employee("A26","Reva",30,78536.52);
        Employee employee7=new Employee("A27","Anku",30,78536.52);
        Employee employee8=new Employee("A28","Ritu",27,78536.52);
        Employee employee9=new Employee("A29","Urmi",28,78536.52);
        Employee employee10=new Employee("A30","Chiku",25,78536.52);
        ibmEmployees.add(employee1);
        ibmEmployees.add(employee2);
        ibmEmployees.add(employee3);
        ibmEmployees.add(employee4);
        ibmEmployees.add(employee5);
        ibmEmployees.add(employee6);
        ibmEmployees.add(employee7);
        ibmEmployees.add(employee8);
        ibmEmployees.add(employee9);
        ibmEmployees.add(employee10);

        ArrayList<Employee> tcsEmployees=new ArrayList<>();
        Employee employee11=new Employee("A21","Rahu",30,78536.52);
        Employee employee12=new Employee("A22","shubham",28,78536.52);
        Employee employee13=new Employee("A23","Shreya",35,78536.52);
        Employee employee14=new Employee("A24","Sidhi",50,78536.52);
        Employee employee15=new Employee("A25","Rinku",40,78536.52);
        Employee employee16=new Employee("A26","Reva",30,78536.52);
        Employee employee17=new Employee("A27","Anku",30,78536.52);
        Employee employee18=new Employee("A28","Ritu",27,78536.52);
        Employee employee19=new Employee("A29","Urmi",28,78536.52);
        Employee employee20=new Employee("A30","Chiku",25,78536.52);
        tcsEmployees.add(employee11);
        tcsEmployees.add(employee12);
        tcsEmployees.add(employee13);
        tcsEmployees.add(employee14);
        tcsEmployees.add(employee15);
        tcsEmployees.add(employee16);
        tcsEmployees.add(employee17);
        tcsEmployees.add(employee18);
        tcsEmployees.add(employee19);
        tcsEmployees.add(employee20);


        ArrayList<Employee> infoEmployees=new ArrayList<>();
        Employee employee21=new Employee("A21","Rahu",30,78536.52);
        Employee employee22=new Employee("A22","shubham",28,78536.52);
        Employee employee23=new Employee("A23","Shreya",35,78536.52);
        Employee employee24=new Employee("A24","Sidhi",50,78536.52);
        Employee employee25=new Employee("A25","Rinku",40,78536.52);
        Employee employee26=new Employee("A26","Reva",30,78536.52);
        Employee employee27=new Employee("A27","Anku",30,78536.52);
        Employee employee28=new Employee("A28","Ritu",27,78536.52);
        Employee employee29=new Employee("A29","Urmi",28,78536.52);
        Employee employee30=new Employee("A30","Chiku",25,78536.52);
        infoEmployees.add(employee21);
        infoEmployees.add(employee22);
        infoEmployees.add(employee23);
        infoEmployees.add(employee24);
        infoEmployees.add(employee25);
        infoEmployees.add(employee26);
        infoEmployees.add(employee27);
        infoEmployees.add(employee28);
        infoEmployees.add(employee29);
        infoEmployees.add(employee30);
        empData.put("IBM",ibmEmployees);
        empData.put("TCS",tcsEmployees);
      empData.put("INFSYS",infoEmployees);

for (String key:empData.keySet()){

  System.out.println("Printing Emp Data");
  ArrayList<Employee> employees=empData.get(key);
  for (int i=0;i<employees.size();i++) {
    if (key.equalsIgnoreCase("TCS") || key.equalsIgnoreCase("IBM")) {

      // if( (empData.equals(tcsEmployees) )&& (empData.equals(ibmEmployees))) {
      System.out.println("DATA:" + key + ":" + "EmpId" + ":" + employees.get(i).getEmpId() + "," + "Name" + ":" + employees.get(i).getEmpName() + "," + "Age" + ":" + employees.get(i).getAge() + "," + "Sal" + ":" + employees.get(i).getSal());
      // }
    }
  }
}





    }



    public static void main(String[] args) {
        EmployeeHashMap obj=new EmployeeHashMap();
        obj.createEmployeeData();
    }

}
