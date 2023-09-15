package Hashset;

import java.util.HashSet;

public class DemoEngineerHashset {

    public HashSet<Engineer>createEngSet(){

        HashSet<Engineer>engineers=new HashSet<>();

        Engineer engineer1=new Engineer("Akash","Gwalior",1,"VijayNagar",9007);
        System.out.println("hashcode of engineer1"+engineer1.hashCode());
        Engineer engineer2=new Engineer("Chinu","Datia",2,"VijayNagar",6780);
        System.out.println("hashcode of engineer2"+engineer2.hashCode());
        Engineer engineer3=new Engineer("Raman","Indore",3,"SudamaPuri",7809);
        System.out.println("hashcode of engineer3"+engineer3.hashCode());
        Engineer engineer4=new Engineer("Akash","Gwalior",1,"VijayNagar",9007);
        System.out.println("hashcode of engineer4"+engineer4.hashCode());
        Engineer engineer5=new Engineer("Harman","Khandwa",5,"VijayNagar",9007);
        System.out.println("hashcode of student5"+engineer5.hashCode());
        Engineer engineer6=new Engineer("Raman","Indore",3,"SudamaPuri",7809);
        System.out.println("hashcode of engineer6"+engineer6.hashCode());

        engineers.add(engineer1);
        engineers.add(engineer2);
        engineers.add(engineer3);
        engineers.add(engineer4);
        engineers.add(engineer5);
        engineers.add(engineer6);

        return engineers;

    }

    public static void main(String[] args) {
        DemoEngineerHashset obj=new DemoEngineerHashset();
        HashSet<Engineer>engineers=obj.createEngSet();

        for (Engineer engineer:engineers){
            System.out.println("name of engineer"+engineer.getName()+"city of engineer"+engineer.getCity()+"employeeId of engineer"+engineer.getEmployeeId()+"address of engineer"+engineer.getAddress()+"salary of engineer"+engineer.getSalary());

        }
    }
}
