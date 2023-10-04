package collection.hashmap;

import collection.model.Employee;
import collection.model.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DemoUniqueStudentData {

    public HashMap<String, HashSet<Student>>createStudentData()
    {
        HashMap<String, HashSet<Student>> studentMap=new HashMap<>();
        //Data f student
        Student student1=new Student(1,"Anvit",25,"CS");
        Student student2=new Student(2,"Anuradha",28,"IT");
        Student student3=new Student(3,"Akshay",24,"CS");
        Student student4=new Student(1,"Anvit",25,"CS");
        Student student5=new Student(2,"Anuradha",28,"IT");

        //create HashSet
        HashSet<Student> amgiHashSet=new HashSet<>();
        amgiHashSet.add(student1);
        amgiHashSet.add(student2);
        amgiHashSet.add(student3);
        amgiHashSet.add(student4);
        amgiHashSet.add(student5);
        studentMap.put("AMG",amgiHashSet);
        return studentMap;
    }

    public static void main(String[] args) {
        DemoUniqueStudentData obj=new DemoUniqueStudentData();
        HashMap<String, HashSet<Student>> map=obj.createStudentData();
        Set<Student> studentSet=map.get("AMG");
        for (Student var:studentSet)
        {

            System.out.println("RollNo:"+var.getRollNo()+"\t Name: "+var.getName()+"\t age: \t"+ var.getAge()+"\t section: \t"+var.getSection());
        }

    }


}
