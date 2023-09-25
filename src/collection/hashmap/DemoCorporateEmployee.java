package collection.hashmap;

import collection.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoCorporateEmployee {

    public void createCompanyData(){

        HashMap<String, ArrayList<Employee>> companyData = new HashMap<>();
        ArrayList<Employee> ibmEmployeeList = new ArrayList<>();

        Employee employee1 = new Employee("IBM","Rohan","2345ch",56000.0);
        Employee employee2 = new Employee("IBM","Palak","2345ch",56000.0);
        Employee employee3 = new Employee("IBM","Ashu","2345ch",56000.0);
        Employee employee4 = new Employee("IBM","Ronak","2345ch",56000.0);
        Employee employee5 = new Employee("IBM","Sanjay","2345ch",56000.0);
        Employee employee6 = new Employee("IBM","Herry","2345ch",56000.0);
        Employee employee7 = new Employee("IBM","Aryan","2345ch",56000.0);
        Employee employee8 = new Employee("IBM","Deepak","2345ch",56000.0);
        Employee employee9 = new Employee("IBM","Krish","2345ch",56000.0);
        Employee employee10 = new Employee("IBM","Amit","2345ch",56000.0);

        ibmEmployeeList.add(employee1);
        ibmEmployeeList.add(employee2);
        ibmEmployeeList.add(employee3);
        ibmEmployeeList.add(employee4);
        ibmEmployeeList.add(employee5);
        ibmEmployeeList.add(employee6);
        ibmEmployeeList.add(employee7);
        ibmEmployeeList.add(employee8);
        ibmEmployeeList.add(employee9);
        ibmEmployeeList.add(employee10);


        companyData.put("IBM",ibmEmployeeList);

        System.out.println(" Printing IBM Employee data : "+companyData);

        ArrayList<Employee> TCSEmployeeList = new ArrayList<>();


        Employee employee11 = new Employee("TCS","Rohan","2345ch",56000.0);
        Employee employee12 = new Employee("TCS","Palak","2345ch",56000.0);
        Employee employee13 = new Employee("TCS","Ashu","2345ch",56000.0);
        Employee employee14 = new Employee("TCS","Ronak","2345ch",56000.0);
        Employee employee15 = new Employee("TCS","Sanjay","2345ch",56000.0);
        Employee employee16 = new Employee("TCS","Herry","2345ch",56000.0);
        Employee employee17 = new Employee("TCS","Aryan","2345ch",56000.0);
        Employee employee18 = new Employee("TCS","Deepak","2345ch",56000.0);
        Employee employee19 = new Employee("TCS","Ankit","6789gh",56000.0);
        Employee employee20 = new Employee("TCS","Amit","2345ch",56000.0);

        TCSEmployeeList.add(employee11);
        TCSEmployeeList.add(employee12);
        TCSEmployeeList.add(employee13);
        TCSEmployeeList.add(employee14);
        TCSEmployeeList.add(employee15);
        TCSEmployeeList.add(employee16);
        TCSEmployeeList.add(employee17);
        TCSEmployeeList.add(employee18);
        TCSEmployeeList.add(employee19);
        TCSEmployeeList.add(employee20);

        companyData.put("TCS",TCSEmployeeList);

        System.out.println(" Printing TCS Employee data :"+companyData);


        ArrayList<Employee> INFOSYSEmployeeList = new ArrayList<>();

        Employee employee21 = new Employee("TCS","Rohan","2345ch",56000.0);
        Employee employee22 = new Employee("TCS","Komal","4345ch",57000.0);
        Employee employee23 = new Employee("TCS","Rihan","2445ch",58000.0);
        Employee employee24 = new Employee("TCS","Siv","62345fh",59000.0);
        Employee employee25 = new Employee("TCS","Karan","2356co",61000.0);
        Employee employee26 = new Employee("TCS","Arun","5745ch",62000.0);
        Employee employee27 = new Employee("TCS","Yash","2235ch",63000.0);
        Employee employee28 = new Employee("TCS","Sohan","23445ed",65000.0);
        Employee employee29 = new Employee("TCS","Kamal","9876th",66000.0);
        Employee employee30 = new Employee("TCS","Payal","3465jk",70000.0);

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

        companyData.put("INFOSYS",INFOSYSEmployeeList);

        System.out.println(" Printing INFOSYS Employee data:"+companyData);

        for (String Key : companyData.keySet()){
            System.out.println(" Printing Company data : ");

            ArrayList<Employee> employees = companyData.get(Key);

            for (int i = 0; i<employees.size(); i++){
                System.out.println(" Printing Companies data : "+Key +" : "+employees.get(i).getName()+" , "+employees.get(i).getID()+ " , "+employees.get(i).getSalary());
            }
        }
    }

    public static void main(String args []){

        DemoCorporateEmployee Obj = new DemoCorporateEmployee();
        Obj.createCompanyData();


    }
}
