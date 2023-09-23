package Collection.ArrayList;

import java.security.Key;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class EmployeeHashmap {

    public void createEmployeeData(){

        HashMap<String, ArrayList<Employee>>EmployeeData=new HashMap<>();

        ArrayList<Employee>IBmEmployeeList=new ArrayList<>();

        Employee employee1=new Employee("Rahul",1,55000);
        Employee employee2=new Employee("Tapan",2,70000);
        Employee employee3=new Employee("Puneet",3,15000);
        Employee employee4=new Employee("Raj Hans",4,55000);
        Employee employee5=new Employee("Rituraj",5,49000);
        Employee employee6=new Employee("Karan",6,88000);
        Employee employee7=new Employee("Yash",7,98000);
        Employee employee8=new Employee("Prakhar",8,88000);
        Employee employee9=new Employee("Mohit",9,77000);
        Employee employee10=new Employee("Raj",10,66000);

        IBmEmployeeList.add(employee1);
        IBmEmployeeList.add(employee2);
        IBmEmployeeList.add(employee3);
        IBmEmployeeList.add(employee4);
        IBmEmployeeList.add(employee5);
        IBmEmployeeList.add(employee6);
        IBmEmployeeList.add(employee7);
        IBmEmployeeList.add(employee8);
        IBmEmployeeList.add(employee9);
        IBmEmployeeList.add(employee10);

        EmployeeData.put("IBM",IBmEmployeeList);



        ArrayList<Employee>TcsEmployeeList=new ArrayList<>();

        Employee employee11=new Employee("Rahul",11,55000);
        Employee employee12=new Employee("Mukesh",12,65467);
        Employee employee13=new Employee("Harsh",13,74653);
        Employee employee14=new Employee("Darsh",14,76324);
        Employee employee15=new Employee("Happy",15,87654);
        Employee employee16=new Employee("Kapil",16,65412);
        Employee employee17=new Employee("Jack",17,65543);
        Employee employee18=new Employee("Jill",18,65421);
        Employee employee19=new Employee("Pollard",19,76543);
        Employee employee20=new Employee("Akshit",20,12231);

        TcsEmployeeList.add(employee11);
        TcsEmployeeList.add(employee12);
        TcsEmployeeList.add(employee13);
        TcsEmployeeList.add(employee14);
        TcsEmployeeList.add(employee15);
        TcsEmployeeList.add(employee16);
        TcsEmployeeList.add(employee17);
        TcsEmployeeList.add(employee18);
        TcsEmployeeList.add(employee19);
        TcsEmployeeList.add(employee20);

        EmployeeData.put("TCS",TcsEmployeeList);


        ArrayList<Employee>INFOSYSEmployeeList=new ArrayList<>();

        Employee employee21=new Employee("Rahul",21,55000);
        Employee employee22=new Employee("Narendra",21,8765);
        Employee employee23=new Employee("Krishna",21,22131);
        Employee employee24=new Employee("Parth",21,43211);
        Employee employee25=new Employee("Kashif",21,11121);
        Employee employee26=new Employee("Deepak",21,43211);
        Employee employee27=new Employee("Nikhil",21,22121);
        Employee employee28=new Employee("Sunil",21,32234);
        Employee employee29=new Employee("Anil",21,33214);
        Employee employee30=new Employee("Chetak",21,32891);

        INFOSYSEmployeeList.add(employee21);
        INFOSYSEmployeeList.add(employee22);
        INFOSYSEmployeeList.add(employee23);
        INFOSYSEmployeeList.add(employee24);
        INFOSYSEmployeeList.add(employee25);
        INFOSYSEmployeeList.add(employee26);
        INFOSYSEmployeeList.add(employee27);
        INFOSYSEmployeeList.add(employee28);
        INFOSYSEmployeeList.add(employee29);
        INFOSYSEmployeeList.add(employee30);

        EmployeeData.put("INFOSYS",INFOSYSEmployeeList);

        System.out.println("printing employee data"+EmployeeData);

        for (String key:EmployeeData.keySet()){
            System.out.println("printing Employee data");

            ArrayList<Employee>employees=EmployeeData.get(key);

            for (int i=0; i<employees.size(); i++){
                System.out.println("printing employee data :"+key+" : "+employees.get(i).getName()+" , "+employees.get(i).getEmployeeId()+" , "+employees.get(i).getSalary());
            }
        }

    }

    public static void main(String[] args) {
        EmployeeHashmap obj=new EmployeeHashmap();
        obj.createEmployeeData();
    }
}
