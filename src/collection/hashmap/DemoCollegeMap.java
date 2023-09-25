package collection.hashmap;


import collection.model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DemoCollegeMap {

    public void createCollegeData(){

        HashMap< String , ArrayList<Student> > collegeData= new HashMap<>();

        // create list of delhi college students
        ArrayList<Student> delhiStudentList= new ArrayList<>();
        // create data for Students
        Student student1= new Student("Raj",21,"CS");
        Student student2= new Student("Rajat",21,"IT");
        Student student3= new Student("Mohit",20,"CS");

        delhiStudentList.add(student1);
        delhiStudentList.add(student2);
        delhiStudentList.add(student3);

        collegeData.put("Delhi" , delhiStudentList);

        ArrayList<Student> jnuStudentList= new ArrayList<>();

        Student student4= new Student("Mukesh",21,"CS");
        Student student5= new Student("Mohit",21,"IT");
        Student student6= new Student("Raj kumar",20,"CS");

        jnuStudentList.add(student4);
        jnuStudentList.add(student5);
        jnuStudentList.add(student6);


        collegeData.put("JNU",jnuStudentList);

        ArrayList<Student> dpsStudentList= new ArrayList<>();
        Student student7= new Student("Mukesh singh",21,"CS");
        Student student8= new Student("Mohit singh",21,"IT");
        Student student9= new Student("Raj kumar singh",20,"CS");
        dpsStudentList.add(student7);
        dpsStudentList.add(student8);
        dpsStudentList.add(student9);

        collegeData.put("DPS",dpsStudentList);

        System.out.println("Printing college data: "+collegeData);

        for(String key: collegeData.keySet()){

            System.out.println("Printing college data: ");
            ArrayList<Student> students= collegeData.get(key);

             for(int i=0; i<students.size(); i++) {
                 if (students.get(i).getSection().equals("IT")) {
                     System.out.println("Printing college data : " + key + " : " + students.get(i).getName() + " , " + students.get(i).getSection());
                 }
             }

        }

    }

    public static void main(String[] args) {
        DemoCollegeMap obj= new DemoCollegeMap();
        obj.createCollegeData();
    }
}
