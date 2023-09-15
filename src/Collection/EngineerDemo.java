package Collection;

import Collection.Model.Engineer;

import java.util.HashSet;

public class EngineerDemo {
    public HashSet<Engineer> CreateEngineer() {
        HashSet<Engineer> EngineerData = new HashSet<>();
        Engineer Eng1 = new Engineer("Ravi", "123A", "Civil", 40000.78);
        System.out.println("Hashcode of Doctor1 " + Eng1.hashCode());
        Engineer Eng2 = new Engineer("Rakesh", "124A", "MCA", 44567.78);
        System.out.println("Hashcode of Doctor2 " + Eng2.hashCode());

        Engineer Eng3 = new Engineer("Ravi", "123A", "Civil", 40000.78);
        System.out.println("Hashcode of Doctor3 " + Eng3.hashCode());

        Engineer Eng4 = new Engineer("Shiv KUmar", "125A", "IT", 50000.78);
        System.out.println("Hashcode of Doctor4 " + Eng4.hashCode());

        Engineer Eng5 = new Engineer("Mukesh Kumar", "126A", "CSE", 60000.78);
        System.out.println("Hashcode of Doctor5 " + Eng5.hashCode());

        Engineer Eng6 = new Engineer("Shiv KUmar", "125A", "IT", 50000.78);
        System.out.println("Hashcode of Doctor6 " + Eng6.hashCode());


        EngineerData.add(Eng1);
        EngineerData.add(Eng2);


        EngineerData.add(Eng3);
        EngineerData.add(Eng4);


        EngineerData.add(Eng5);
        EngineerData.add(Eng6);

        return EngineerData;

    }

    public static void main(String[] args) {
        EngineerDemo obj = new EngineerDemo();
        HashSet<Engineer> Engineers = obj.CreateEngineer();
        for (Engineer var : Engineers) {
            System.out.println("Name : " + var.getEngineerName() + " ID : " + var.getEngineerID() + " Dept :" + var.getEngineerDept() + " Salary " + var.getEngineerSalary());
        }
    }
}