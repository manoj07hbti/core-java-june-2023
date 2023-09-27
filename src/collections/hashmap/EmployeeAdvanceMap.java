package collections.hashmap;

import collections.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeAdvanceMap {

    // WE WILL CREATE A METHOD....

    public void allCompanyData() {

        HashMap<String, ArrayList<Employee>> companyData = new HashMap<>();

        // WE NEED TO CREATE DATA FOR EMPLOYEE COMPANY...........
        // FIRST WE WILL CREATE ARRAY LIST


        // CREATE LIST OF IBM COMPANY DATA...........

        ArrayList<Employee> ibmCompanyEmp = new ArrayList<>();

        // CREATE DATA FOR IBM COM.
        Employee employee1 = new Employee("Jay Rawat ", " IT ", 65000);
        Employee employee2 = new Employee("Kamal  ", " Furniture ", 70000);
        Employee employee3 = new Employee("Mohan ", " HR ", 80000);
        Employee employee4 = new Employee("Wendy ", " IT ", 75000);
        Employee employee5 = new Employee("Veer ", " Furniture", 50000);
        Employee employee6 = new Employee("Dev ", " HR ", 85000);
        Employee employee7 = new Employee("Soniya  ", " IT ", 55000);
        Employee employee8 = new Employee("Monika ", " HR ", 65000);
        Employee employee9 = new Employee("Deepa ", " IT ", 70000);
        Employee employee10 = new Employee("Kapil ", " Furniture ", 70000);

        // ADD IBM COMPANY DATA..........
        ibmCompanyEmp.add(employee1);
        ibmCompanyEmp.add(employee2);
        ibmCompanyEmp.add(employee3);
        ibmCompanyEmp.add(employee4);
        ibmCompanyEmp.add(employee5);
        ibmCompanyEmp.add(employee6);
        ibmCompanyEmp.add(employee7);
        ibmCompanyEmp.add(employee8);
        ibmCompanyEmp.add(employee9);
        ibmCompanyEmp.add(employee10);

        // ALL DATA  WE WILL TAKE IN HASH MAP...........
        companyData.put("IBM Company", ibmCompanyEmp);
//*****************************************************************************************************************************************************
        Employee employee11 = new Employee("Suraj", " IT ", 65000);
        Employee employee12 = new Employee("Mohini", " Furniture ", 70000);
        Employee employee13 = new Employee("Shivani", " HR ", 80000);
        Employee employee14 = new Employee("Shalini", " IT ", 75000);
        Employee employee15 = new Employee("Dharm", " Furniture", 50000);
        Employee employee16 = new Employee("Roni", " HR ", 85000);
        Employee employee17 = new Employee("Somya", " IT ", 55000);
        Employee employee18 = new Employee("Hitesh ", " HR ", 65000);
        Employee employee19 = new Employee("Suman", " IT ", 70000);
        Employee employee20 = new Employee("Pankaj", " Furniture ", 70000);

        ArrayList<Employee> tcsCompanyEmp = new ArrayList<>();

        tcsCompanyEmp.add(employee11);
        tcsCompanyEmp.add(employee12);
        tcsCompanyEmp.add(employee13);
        tcsCompanyEmp.add(employee14);
        tcsCompanyEmp.add(employee15);
        tcsCompanyEmp.add(employee16);
        tcsCompanyEmp.add(employee17);
        tcsCompanyEmp.add(employee18);
        tcsCompanyEmp.add(employee19);
        tcsCompanyEmp.add(employee20);

        companyData.put("TCS", tcsCompanyEmp);
        //************************************************************************************************************************************************
        Employee employee21 = new Employee("Sandip ", " IT ", 65000);
        Employee employee22 = new Employee("Lovely", " Furniture ", 70000);
        Employee employee23 = new Employee("Deshdip", " HR ", 80000);
        Employee employee24 = new Employee("Param", " IT ", 75000);
        Employee employee25 = new Employee("Bir bal ", " Furniture", 50000);
        Employee employee26 = new Employee("Nitya", " HR ", 85000);
        Employee employee27 = new Employee("Kuldip ", " IT ", 55000);
        Employee employee28 = new Employee("Sakshi", " HR ", 65000);
        Employee employee29 = new Employee("Nancy", " IT ", 70000);
        Employee employee30 = new Employee("Madhu", " Furniture ", 70000);

        ArrayList<Employee> airtelCompanyEmp = new ArrayList<>();

        airtelCompanyEmp.add(employee21);
        airtelCompanyEmp.add(employee22);
        airtelCompanyEmp.add(employee23);
        airtelCompanyEmp.add(employee24);
        airtelCompanyEmp.add(employee25);
        airtelCompanyEmp.add(employee26);
        airtelCompanyEmp.add(employee27);
        airtelCompanyEmp.add(employee28);
        airtelCompanyEmp.add(employee29);
        airtelCompanyEmp.add(employee30);

        companyData.put("AIRTEL", airtelCompanyEmp);

        System.out.println("Printing Company Data " + companyData);

        for (String key : companyData.keySet()) {

            System.out.println("Printing Company Data");

            ArrayList<Employee> employees = companyData.get(key);
            for (int i=0; i<employees.size(); i++){

                System.out.println("Printing Company Data : " +key+ " : " + employees.get(i).getName()+" , " +employees.get(i).getDepartment()+" , " + employees.get(i).getSalary() );
            }
        }
        }

        public static void main (String[]args){
// WE WILL CREATE OBJECT IN MAIN METHOD.........
            EmployeeAdvanceMap obj = new EmployeeAdvanceMap();
            obj.allCompanyData();

        }

    }











