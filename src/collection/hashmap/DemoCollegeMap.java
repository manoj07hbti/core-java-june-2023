package collection.hashmap;

import collection.model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoCollegeMap {

    public void createCollegeData(){

        HashMap<String, ArrayList<Student>> collegeData =new HashMap<>();
        ArrayList<Student> delhiStudentList=new ArrayList<>();

        //TODO:create data for delhi student
        Student student1=new Student(1,"Raj",25,"CS");
        Student student2=new Student(2,"Suraj",27,"Mechanical");
        Student student4=new Student(4,"Raviraj",25,"CS");
        Student student3=new Student(3,"Shivani",28,"Civil");
        delhiStudentList.add(student1);
        delhiStudentList.add(student2);
        delhiStudentList.add(student3);
        delhiStudentList.add(student4);

        ArrayList<Student> jnuStudentList=new ArrayList<>();

        //TODO:create data for jnu student
        Student student7=new Student(1,"Raj",25,"CS");
        Student student5=new Student(2,"Suraj",27,"Mechanical");
        Student student6=new Student(3,"Shivani",28,"Civil");
        Student student8=new Student(2,"Suraj",27,"Mechanical");
        Student student9=new Student(4,"Sartaj",27,"Mechanical");
        jnuStudentList.add(student4);
        jnuStudentList.add(student5);
        jnuStudentList.add(student7);
        jnuStudentList.add(student8);
        jnuStudentList.add(student9);

        ArrayList<Student> dmStudentList=new ArrayList<>();

        //TODO:create data for dm student
        Student student10=new Student(1,"Raj",25,"CS");
        Student student11=new Student(2,"Suraj",27,"Mechanical");
        Student student12=new Student(3,"Shivani",28,"Civil");
        dmStudentList.add(student10);
        dmStudentList.add(student11);
        dmStudentList.add(student12);

        collegeData.put("Delhi",delhiStudentList);
        collegeData.put("JNU",jnuStudentList);
        collegeData.put("DM",dmStudentList);
        System.out.println("Printing data:"+collegeData+"\n");
        for (String key:collegeData.keySet()){
            System.out.println("Printing college data:");
            ArrayList<Student> students=collegeData.get(key);
            for (int i=0;i<students.size();i++)
            {
                System.out.println("Printing data:"+key+":"+students.get(i).getRollNo()+","+students.get(i).getName()+","+students.get(i).getAge()+","+students.get(i).getSection());
            }
        }




    }

    public static void main(String[] args) {
        DemoCollegeMap obj=new DemoCollegeMap();
        obj.createCollegeData();
    }
}
