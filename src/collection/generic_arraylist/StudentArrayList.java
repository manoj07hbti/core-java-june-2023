package collection.generic_arraylist;

import collection.model.Student;

import java.util.ArrayList;

public class StudentArrayList {//TODO connecting class

    public ArrayList<Student> createStudentList() {

        ArrayList<Student> studentsData = new ArrayList<>();

        Student student1 = new Student("Jatin", 21, "it");
        Student student2 = new Student("Vandana", 19, "medic");
        Student student3 = new Student("Ojal", 20, "webtoon");
        Student student4 = new Student("Mohit", 18, "metric");
        Student student5 = new Student("Mukul", 19, "inter");

        studentsData.add(student1);
        studentsData.add(student2);
        studentsData.add(student3);
        studentsData.add(student4);
        studentsData.add(student5);

        return studentsData;
    }


    public static void main(String[] args) {

        StudentArrayList obj = new StudentArrayList();
        ArrayList<Student> Data = obj.createStudentList();
        System.out.println("****Using for loop****");
        for (int i = 0; i < Data.size(); i++) {
            System.out.println("Name :" + Data.get(i).getName() + " Age :" + Data.get(i).getAge() + " Section :" + Data.get(i).getSection());
        }

        System.out.println("");
        System.out.println("****Using while loop****");
        System.out.println("");
        int j = 0;
        while (j < Data.size()) {
            System.out.println("Name :" + Data.get(j).getName() + " Age :" + Data.get(j).getAge() + " Section :" + Data.get(j).getSection());
            j++;
        }
        System.out.println("");
        System.out.println("****Using do while loop****");
        System.out.println("");
        int k = 0;
        do {
            System.out.println("Name :" + Data.get(k).getName() + " Age :" + Data.get(k).getAge() + " Section :" + Data.get(k).getSection());
            k++;
        } while (k < Data.size());

        System.out.println("");
        System.out.println("****Using do while loop****");
        System.out.println("");
        for (Student var : Data) {
            System.out.println("Name :" + var.getName() + " Age :" + var.getAge() + " Section :" + var.getSection());
        }
    }
}
