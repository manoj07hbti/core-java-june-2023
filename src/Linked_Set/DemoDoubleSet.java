package Linked_Set;

import java.util.LinkedHashSet;

public class DemoDoubleSet {

    public  LinkedHashSet<Double> createSalaryList(){

        LinkedHashSet<Double>salary=new LinkedHashSet<>();
        salary.add(675.09);
        salary.add(6549.0);
        salary.add(980.9);
        salary.add(9876.09);
        salary.add(568.9);
        salary.add(4321.9);
        salary.add(879.0);
        salary.add(768.90);
        salary.add(7658.90);
        salary.add(5480.97);

        return salary;
    }

    public static void main(String[] args) {
        DemoDoubleSet obj=new DemoDoubleSet();
        LinkedHashSet<Double> result=obj.createSalaryList();

        for (Double var:result){
            System.out.println("printing all data linked hashset"+var);
        }
    }
}
