package Test_2oct;

import java.util.*;

public class EmployeeClass {

    public HashMap<String,ArrayList<Employee>> CreateEmployeeInformation(){

        HashMap<String,ArrayList<Employee>>map=new HashMap<>();

        ArrayList<Employee> IBMEmployee=new ArrayList<>();

        Employee employee1=new Employee("Gagan","Pune","cs",55500);
        Employee employee2=new Employee("Rohan","indore","Electrical",30500);
        Employee employee3=new Employee("Vipin","khandwa","Robotics",40500);
        Employee employee4=new Employee("Gagandeep","Khargone","Artificial intelligence",11200);
        Employee employee5=new Employee("Pawan","pune","cs",55800);

        IBMEmployee.add(employee1);
        IBMEmployee.add(employee2);
        IBMEmployee.add(employee3);
        IBMEmployee.add(employee4);
        IBMEmployee.add(employee5);

        map.put("IBM",IBMEmployee);


        ArrayList<Employee> TCSEmployee=new ArrayList<>();

        Employee employee6=new Employee("Harshit","Pune","cs",55400);
        Employee employee7=new Employee("Harsh","Gwalior","Marketing",40400);
        Employee employee8=new Employee("Kunal","pune","Finance",55600);
        Employee employee9=new Employee("Ramesh","Jhansi","Hospitality",53400);
        Employee employee10=new Employee("Chandan","Amarvati","civil",40400);

        TCSEmployee.add(employee6);
        TCSEmployee.add(employee7);
        TCSEmployee.add(employee8);
        TCSEmployee.add(employee9);
        TCSEmployee.add(employee10);

        map.put("TCS",TCSEmployee);


        ArrayList<Employee>WiproEmployee=new ArrayList<>();

        Employee employee11=new Employee("Bablu","Salem","Education",23300);
        Employee employee12=new Employee("Ballu","Burhanpur","Civil",20300);
        Employee employee13=new Employee("Veer","Balaghat","Criminal",23100);
        Employee employee14=new Employee("Viru","Chinndwara","Corporate",21300);
        Employee employee15=new Employee("Virendra","Ashoknagar","CivilMatters",22300);

        WiproEmployee.add(employee11);
        WiproEmployee.add(employee12);
        WiproEmployee.add(employee13);
        WiproEmployee.add(employee14);
        WiproEmployee.add(employee15);

        map.put("WIPRO",WiproEmployee);


        ArrayList<Employee>CTSEmployee=new ArrayList<>();

        Employee employee16=new Employee("Kapil","jaipur","Loans",11000);
        Employee employee17=new Employee("Kapish","jaipur","Marketing",10000);
        Employee employee18=new Employee("Kapi","jaipur","operation",13000);
        Employee employee19=new Employee("Deepak","jaipur","Cardiology",16000);
        Employee employee20=new Employee("nikhil","jaipur","nephrology",19000);

        CTSEmployee.add(employee16);
        CTSEmployee.add(employee17);
        CTSEmployee.add(employee18);
        CTSEmployee.add(employee19);
        CTSEmployee.add(employee20);

        map.put("CTS",CTSEmployee);

        return map;

    }

    public static void main(String[] args) {
        EmployeeClass obj=new EmployeeClass();
        HashMap<String,ArrayList<Employee>> emp=obj.CreateEmployeeInformation();

        Set<String> set=emp.keySet();

        for (String var: set){
            System.out.println("printing employee data :");

            ArrayList<Employee>Map=emp.get(var);
            for (int i=0; i < Map.size(); i++){
                if (var.equals("IBM") || var.equals("TCS")){
                    if (Map.get(i).getEmployeeSalary() > 50000){

                        System.out.println("printing "+var+" Name : "+ Map.get(i).getEmployeeName()+" city :"+ Map.get(i).getEmployeeCity()+" Department :"+ Map.get(i).getEmployeeDepartment()+"Salary :"+ Map.get(i).getEmployeeSalary());

                    }
                }


            }
        }



        }


        }



















