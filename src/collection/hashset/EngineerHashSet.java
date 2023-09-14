package collection.hashset;

import collection.model.Engineer;

import java.util.ArrayList;
import java.util.HashSet;

public class EngineerHashSet {

    public HashSet<Engineer> createEngineerSet() {

        HashSet<Engineer> engineers = new HashSet<>();

        Engineer engineer1 = new Engineer("Jatin", "12t", 45454.12);
        System.out.println("Hashcode of Engineer1 is:" + engineer1.hashCode());
        Engineer engineer2 = new Engineer("Ojal", "11t", 42254.13);
        System.out.println("Hashcode of Engineer2 is:" + engineer2.hashCode());
        Engineer engineer3 = new Engineer("Vandana", "10t", 43454.22);
        System.out.println("Hashcode of Engineer3 is:" + engineer3.hashCode());
        Engineer engineer4 = new Engineer("Omiya", "9t", 41454.32);
        System.out.println("Hashcode of Engineer4 is:" + engineer4.hashCode());
        Engineer engineer5 = new Engineer("Raj", "1t", 40454.36);
        System.out.println("Hashcode of Engineer5 is:" + engineer5.hashCode());
        Engineer engineer6 = new Engineer("Jatin", "12t", 45454.12);
        System.out.println("Hashcode of Engineer6 is:" + engineer6.hashCode());
        Engineer engineer7 = new Engineer("Ojal", "11t", 42254.13);
        System.out.println("Hashcode of Engineer7 is:" + engineer7.hashCode());
        Engineer engineer8 = new Engineer("Vandana", "10t", 43454.22);
        System.out.println("Hashcode of Engineer8 is:" + engineer8.hashCode());
        Engineer engineer9 = new Engineer("Omiya", "9t", 41454.32);
        System.out.println("Hashcode of Engineer9 is:" + engineer9.hashCode());
        Engineer engineer10 = new Engineer("Raj", "1t", 40454.36);
        System.out.println("Hashcode of Engineer10 is:" + engineer10.hashCode());


        engineers.add(engineer1);
        engineers.add(engineer2);
        engineers.add(engineer3);
        engineers.add(engineer4);
        engineers.add(engineer5);
        engineers.add(engineer6);
        engineers.add(engineer7);
        engineers.add(engineer8);
        engineers.add(engineer9);
        engineers.add(engineer10);


        return engineers;
    }

    public static void main(String[] args) {

        EngineerHashSet obj = new EngineerHashSet();
        HashSet<Engineer> engineersData = obj.createEngineerSet();

        int i = 0;
        for (Engineer var : engineersData) {
            System.out.println("Name is : " + var.getEngName() + "|" + "Id is : " + var.getEngID() + "|" + var.getSalary() + "at INDEX " + i);
            i++;
        }
    }

}
