package cllection.hashset;

import collection.model.Engineer;

import java.util.HashSet;

public class EngineerSet {
    public HashSet<Engineer> creatEnginSet() {
        HashSet<Engineer> engineershashset = new HashSet<>();

        Engineer engineer1 = new Engineer("Rohan", 411, "Hardware", 56000.0);
        System.out.println("Hash code of Engineer 1 :" + engineer1.hashCode());
        Engineer engineer2 = new Engineer("Rohan", 411, "Hardware", 56000.0);
        System.out.println("Hash code of Engineer 3 :" + engineer2.hashCode());
        Engineer engineer3 = new Engineer("Akash", 678, "Software", 55000.0);
        System.out.println("Hash code of Engineer 3 :" + engineer3.hashCode());
        Engineer engineer4 = new Engineer("Akash", 678, "Software", 55000.0);
        System.out.println("Hash code of Engineer 4 :" + engineer4.hashCode());
        Engineer engineer5 = new Engineer("Mohit", 211, "Electrical", 70000.0);
        System.out.println("Hash code of Engineer 5 :" + engineer5.hashCode());
        Engineer engineer6 = new Engineer("Mohit", 211, "Electrical", 70000.0);
        System.out.println("Hash code of Engineer 6 :" + engineer6.hashCode());
        Engineer engineer7 = new Engineer("Rohit", 101, "Mechanical", 60000.0);
        System.out.println("Hash code of Engineer 7 :" + engineer7.hashCode());
        Engineer engineer8 = new Engineer("Rohit", 101, "Mechanical", 60000.0);
        System.out.println("Hash code of Engineer 8 :" + engineer8.hashCode());
        Engineer engineer9 = new Engineer("Abi", 411,"Developer", 75000.0);
        System.out.println("Hash code of Engineer 9 :" + engineer9.hashCode());
        Engineer engineer10 = new Engineer("Abi", 411, "Developer", 75000.0);
        System.out.println("Hash code of Engineer 10 :" + engineer10.hashCode());

        engineershashset.add(engineer1);
        engineershashset.add(engineer2);
        engineershashset.add(engineer3);
        engineershashset.add(engineer4);
        engineershashset.add(engineer5);
        engineershashset.add(engineer6);
        engineershashset.add(engineer7);
        engineershashset.add(engineer8);
        engineershashset.add(engineer9);
        engineershashset.add(engineer10);

        return engineershashset;
    }

    public static void main(String args[]) {

        EngineerSet Obj = new EngineerSet();
        HashSet<Engineer> engineers = Obj.creatEnginSet();

        System.out.println("Printing engineer data : ");

        System.out.println("Using Advanced Loop : ");

        for (Engineer engineer : engineers) {
            System.out.println(" Printing Engineer : " + engineer.getName() + " ID: " + engineer.getId() + " dpt: " + engineer.getDpt() + " salary: " + engineer.getSalary());

        }


    }

    }