package collection.hashmap;

import collection.model.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DemoUniqueData {

    public  HashMap<String, HashSet<Student>> createData(){

        HashMap<String, HashSet<Student>> studentsMap= new HashMap<>();

        // we need data of Students
        Student student1= new Student("Raj",21,"CS");
        Student student2= new Student("Rajat",21,"IT");
        Student student3= new Student("Mohit",20,"CS");
        Student student4= new Student("Rajat",21,"IT");
        Student student5= new Student("Mohit",20,"CS");

        // we need to create HashSet
        HashSet<Student> studentHashSet= new HashSet<>();

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);


        studentsMap.put("NRIC",studentHashSet);

        return studentsMap;

    }

    public static void main(String[] args) {

        DemoUniqueData obj= new DemoUniqueData();
        HashMap<String, HashSet<Student>>  map= obj.createData();

        Set<Student> studentSet= map.get("NRIC");

        for(Student var: studentSet){

            System.out.println("Name: "+var.getName()+" Age: "+var.getAge()+" Section: "+var.getSection());

        }
    }


}
