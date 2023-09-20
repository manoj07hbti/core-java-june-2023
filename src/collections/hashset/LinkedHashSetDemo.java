package collections.hashset;

import collections.model.Doctor;
import collections.model.Employee;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    // FIRST WE WILL CREATE A METHOD FOR DOCTOR AND EMPLOYEE..........

public LinkedHashSet<Employee> createEmployeeList(){

    // WE WILL CREATE OBJECT FOR DOCTOR LIST.......
    LinkedHashSet<Employee> employeesData = new LinkedHashSet<>();
    Employee emp1 = new Employee("Aman","IT",75000);
    Employee emp2 = new Employee("Bharat","CS",80000);
    Employee emp3 = new Employee("Chotu","IT",55000);
    Employee emp4 = new Employee("Dinesh","AI",75000);
    Employee emp5 = new Employee("Faisal","CS",55000);
    Employee emp6 = new Employee("Ganesh","IT",45000);
    Employee emp7 = new Employee("Harish","AI",50000);
    Employee emp8 = new Employee("Jagdish","IT",75000);
    Employee emp9 = new Employee("Kamal","CS",90000);
    Employee emp10 = new Employee("Laxmi","AI",65000);

    employeesData.add(emp1);
    employeesData.add(emp2);
    employeesData.add(emp3);
    employeesData.add(emp4);
    employeesData.add(emp5);
    employeesData.add(emp6);
    employeesData.add(emp7);
    employeesData.add(emp8);
    employeesData.add(emp9);
    employeesData.add(emp10);


    return employeesData;

}

   public LinkedHashSet<Doctor> createDoctorList() {


       // WE WILL CREATE OBJECT FOR DOCTOR LIST....................

       LinkedHashSet<Doctor> doctorsData = new LinkedHashSet<>();
       Doctor doc1 = new Doctor("Dr. Atul Jain", "Hair", 45);
       Doctor doc2 = new Doctor("Dr.Bharat", "Bone", 29);
       Doctor doc3 = new Doctor("Dr.Gagan", "Child", 35);
       Doctor doc4 = new Doctor("Dr. Hari om", "Mind", 36);
       Doctor doc5 = new Doctor("Dr. Vinay", "Hair", 45);
       Doctor doc6 = new Doctor("Dr. Samir", "child", 45);

       doctorsData.add(doc1);
       doctorsData.add(doc2);
       doctorsData.add(doc3);
       doctorsData.add(doc4);
       doctorsData.add(doc5);
       doctorsData.add(doc6);

       return doctorsData;
   }
       public static void main (String[]args){
           LinkedHashSetDemo obj = new LinkedHashSetDemo();
           LinkedHashSet<Employee> empList = obj.createEmployeeList();

           for (Employee var : empList) {
               System.out.println("Printing  Employee Data List  Name : " + var.getName() + " Department : " + var.getDepartment() + " Salary :" + var.getSalary());
           }

           LinkedHashSet<Doctor> docList =   obj.createDoctorList();

           for (Doctor var : docList){

               System.out.println("Printing Doctor Data List Name : " + var.getName() + " Specialist : " + var.getSpecialist() + " Age : " +var.getAge() );

       }


   }

}