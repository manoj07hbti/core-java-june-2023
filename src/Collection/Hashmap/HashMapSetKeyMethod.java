package Collection.Hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapSetKeyMethod {
    public void CreateHashmap3() {
        HashMap<String, Double> Emp = new HashMap<>();
        Emp.put("Rohan Singh", 20000.76);
        Emp.put("Ravi", 30000.76);
        Emp.put("Rahul", 40000.76);
        Emp.put("Renu Singh", 50000.76);
        System.out.println(Emp);
        Set<String> Employee = Emp.keySet();
        for (String var : Employee) {
            System.out.println("Printing Advance for loop Map Keys : " + Emp.get(var));

        }

    }

    public void CreateHashMaps() {
        HashMap<String, String> Map = new HashMap<>();
        Map.put("India", "130 Cr");
        Map.put("China", "160 Cr");
        Map.put("USA", "50 Cr");
        System.out.println("Printing Country Population are : " + Map);
        Set<String> Key = Map.keySet();
        for (String var : Key) {
            System.out.println("Printing Using Advance for loop Country Population are : " + Map.get(var));
        }
    }

    public void CreateHashMap1() {
        HashMap<Integer, String> Student = new HashMap<>();
        // Inserting Student Roll Number and Student Name :
        Student.put(101, "RaviKant Singh");
        Student.put(102, "Manoj Singh");
        Student.put(103, "Rahul Singh");
        Student.put(104, "Rakesh Singh");
        Student.put(105, "Mohan Singh");
        Student.put(106, "Mathur Singh");
        Student.put(107, "Shatyveer Singh");
        Student.put(108, "Mohit Singh");
        Student.put(109, "Bhanu Pratap Singh");
        Student.put(110, "ravi Singh");
        Student.put(111, "RaviKant Singh");
        System.out.println("Printing Student Roll number and Name : " + Student);
        // update student
        Student.put(101, "Manoj Singh");
        System.out.println("update student : " + Student);
        Student.put(108, "Shiv kumar");
        System.out.println("update student : " + Student);
        System.out.println(Student.get(101));
        System.out.println(Student.get(102));
        System.out.println(Student.get(103));
        System.out.println(Student.get(104));
        System.out.println(Student.get(105));
        System.out.println(Student.get(106));
        System.out.println(Student.get(107));
        System.out.println(Student.get(108));
        System.out.println(Student.get(109));
        System.out.println(Student.get(110));
        System.out.println(Student.get(111));

        Set<Integer> Students = Student.keySet();
        for (Integer var : Students) {
            System.out.println("Using Advance for loop Printing Student Name : " + Student.get(var));
        }


    }


    public static void main(String[] args) {
        HashMapSetKeyMethod obj = new HashMapSetKeyMethod();
        obj.CreateHashmap3();
        obj.CreateHashMaps();
        obj.CreateHashMap1();

    }
}
