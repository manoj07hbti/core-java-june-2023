package cllection.hashset;

import collection.model.Employee;
import collection.model.Student;

import java.util.LinkedHashSet;

public class DemoLinkedSet {

    public LinkedHashSet<Integer> createPageNoSet(){

        LinkedHashSet<Integer>set = new LinkedHashSet<>();
        set.add(21);
        set.add(22);
        set.add(23);
        set.add(24);
        set.add(25);
        set.add(26);
        set.add(27);
        set.add(28);
        set.add(29);
        set.add(30);

        return set;

    }
    public LinkedHashSet<Double> createClothesPriceSet(){

        LinkedHashSet<Double>Set = new LinkedHashSet<>();
        Set.add(2000.0);
        Set.add(2050.0);
        Set.add(2500.0);
        Set.add(2700.0);
        Set.add(2080.0);
        Set.add(2200.0);
        Set.add(2900.0);
        Set.add(3000.0);
        Set.add(4000.0);
        Set.add(5000.0);

        return Set;

    }
    public LinkedHashSet<Student> createStudentSet(){
        LinkedHashSet<Student> set = new LinkedHashSet<>();
        set.add(new Student("Rahul",31,95,"IT"));
        set.add(new Student("Poonam",32,85,"Electric"));
        set.add(new Student("Komal",33,75,"ITI"));
        set.add(new Student("Atul",34,65,"IT"));
        set.add(new Student("Dhoni",35,99,"IIT"));
        set.add(new Student("Brajesh",36,87,"BC"));
        set.add(new Student("Krish",37,79,"Reso"));
        set.add(new Student("Anupam",38,68,"BF"));
        set.add(new Student("Bansal",39,92,"DLD"));
        set.add(new Student("Ayush",40,94,"CM"));

        return set;
    }
    public LinkedHashSet<Employee> createEmployeeSet(){

        LinkedHashSet<Employee> set = new LinkedHashSet<>();

        set.add(new Employee("Herry",24,"Developer"," Pune",60000));
        set.add(new Employee("Yogesh",25,"Software"," Noida",65000));
        set.add(new Employee("Abhishek",26,"Hardware"," Delhi",70000));
        set.add(new Employee("Mohit",27,"Electrical"," Agra",75000));
        set.add(new Employee("Rohit",28,"Mechanical"," Bhopal",82000));
        set.add(new Employee("Karan",29,"Developer"," Rutlam",84000));
        set.add(new Employee("Ansh",21,"Architect"," Gwalior",72000));
        set.add(new Employee("Kuldeep",22,"Developer"," Mumbai",86000));
        set.add(new Employee("Ronak",23,"Software"," Kanpur",91000));
        set.add(new Employee("Mahak",20,"Hardware"," Dehradun",90000));

        return set;

    }

    public static void main(String [] args ){

        DemoLinkedSet Obj = new DemoLinkedSet();
       LinkedHashSet<Integer> result = Obj.createPageNoSet();

        System.out.println(" Printing Integer data : ");

       for (Integer var : result){
           System.out.println(" Printing Page No data : "+var);
       }

       LinkedHashSet<Double> result1 = Obj.createClothesPriceSet();

       System.out.println(" Printing double data : ");

       for (Double var : result1 ){
           System.out.println("Printing clothes price data : "+var);

       }
       LinkedHashSet<Student> result2 = Obj.createStudentSet();

       System.out.println(" Printing Students data : ");

       for (Student var : result2 ){
           System.out.println(" Printing Student name : "+var.getName()+" roll no : "+var.getRollno()+ " marks : "+var.getMarks()+ " branch : "+var.getBranch());
       }

       LinkedHashSet<Employee> result3 = Obj.createEmployeeSet();

       System.out.println(" Printing Employee data : ");

       for (Employee var: result3){

           System.out.println(" Printing Employee Name : "+var.getName()+ "age : "+var.getAge()+ " dpt : "+ var.getDpt()+ " Add : "+var.getAdd()+ " Salary : "+var.getSalary());
       }


    }
}
