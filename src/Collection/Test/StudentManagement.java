package Collection.Test;

import java.util.ArrayList;

public class StudentManagement {

    public ArrayList<Student> createStudentList() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1, 85.5, "CS"));
        students.add(new Student("Bob", 2, 78.0, "EE"));
        students.add(new Student("Charlie", 3, 92.5, "CS"));
        students.add(new Student("David", 4, 67.5, "ME"));
        students.add(new Student("Eve", 5, 88.0, "CS"));
        students.add(new Student("Frank", 6, 75.5, "CS"));
        students.add(new Student("Grace", 7, 93.5, "EE"));
        students.add(new Student("Hank", 8, 70.0, "ME"));
        students.add(new Student("Ivy", 9, 91.0, "CS"));
        students.add(new Student("Jack", 10, 82.5, "EE"));


        return students;
    }
    public static void main(String[] args) {

        StudentManagement obj = new StudentManagement();
        ArrayList<Student> studentList =obj.createStudentList();

        // 2. Find students with branch "CS"
        System.out.println("Students in CS branch:");
        for (Student student : studentList) {
            if (student.branch.equals("CS")) {
                System.out.println(student.name);
            }
        }

        // 3. Find student with highest and lowest marks
        Student highestMarkStudent = studentList.get(0);
        Student lowestMarkStudent = studentList.get(0);

        for (Student student : studentList) {
            if (student.marks > highestMarkStudent.marks) {
                highestMarkStudent = student;
            }
            if (student.marks < lowestMarkStudent.marks) {
                lowestMarkStudent = student;
            }
        }

        System.out.println("Student with highest marks: " + highestMarkStudent.name);
        System.out.println("Student with lowest marks: " + lowestMarkStudent.name);

        // 4. Find and print students with roll numbers between 3 and 7
        System.out.println("Students with roll numbers between 3 and 7:");
        for (Student student : studentList) {
            if (student.rollNo >= 3 && student.rollNo <= 7) {
                System.out.println(student.name);
            }
        }

        // 5. Print all students using while loop, do-while loop, and enhanced for loop
        System.out.println("Students using while loop:");
        int i = 0;
        while (i < studentList.size()) {
            System.out.println(studentList.get(i).name);
            i++;
        }

        System.out.println("Students using do-while loop:");
        int j = 0;
        do {
            System.out.println(studentList.get(j).name);
            j++;
        } while (j < studentList.size());

        System.out.println("Students using enhanced for loop:");
        for (Student student : studentList) {
            System.out.println(student.name);
        }
    }
}
