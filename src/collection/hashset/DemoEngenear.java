package collection.hashset;

import collection.model.Engener;

import java.util.HashSet;

public class DemoEngenear {

    public HashSet<Engener> EngenerList() {

        HashSet<Engener> engeners = new HashSet<>();

        Engener engener1 = new Engener("Sudeep", "CS", "TCS", "A23", 85000);
        Engener engener2 = new Engener("Saurabh", "IT", "Amazon", "A21", 55000);
        Engener engener3 = new Engener("Akash", "Mechanical", "TATA Motors", "A66", 70000);
        Engener engener4 = new Engener("Shivam", "Civil", "Lodha", "A56", 90000);
        Engener engener5 = new Engener("Rahul", "EC", "BHEL", "B34", 54000);
        Engener engener6 = new Engener("Sagar", "Electric", "Sun electric", "B56", 45000);
        Engener engener7 = new Engener("Akash", "Mechanical", "TATA Motors", "A66", 70000);
        Engener engener8 = new Engener("Shivam", "Civil", "Lodha", "A56", 90000);
        Engener engener9 = new Engener("Rahul", "EC", "BHEL", "B34", 54000);

        engeners.add(engener1);
        engeners.add(engener2);
        engeners.add(engener3);
        engeners.add(engener4);
        engeners.add(engener5);
        engeners.add(engener6);
        engeners.add(engener7);
        engeners.add(engener8);
        engeners.add(engener9);
        return engeners;
    }

    public static void main(String[] args) {

        DemoEngenear obj = new DemoEngenear();
        HashSet<Engener> result = obj.EngenerList();

        System.out.println("****Print advanced for loops***");

        for (Engener engener : result) {

            System.out.println("Name : " + engener.getName() + "Branch : " + engener.getBranch() + "ID :" + engener.getID() + "Salary :" + engener.getSalary());
        }


    }


}






