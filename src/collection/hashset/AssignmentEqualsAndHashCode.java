package collection.hashset;

import collection.model.Doctor;
import collection.model.Engineer;
import collection.model.Student;

import java.util.HashSet;

public class AssignmentEqualsAndHashCode {

    public HashSet<Student> studentSet(){

        HashSet<Student> stud=new HashSet<>();
        Student student1=new Student(1,"Rutu",25,"CS");
        Student student2=new Student(2,"sonu",25,"Mechanical");
        Student student3=new Student(3,"Rutika",25,"ETC");
        Student student4=new Student(4,"nikita",25,"CS");
        Student student5=new Student(1,"Rutu",25,"CS");
        Student student6=new Student(1,"Rutu",25,"CS");
        Student student7=new Student(2,"sonu",25,"Mechanical");
        Student student8=new Student(1,"Rutu",25,"CS");
        Student student9=new Student(5,"shilpa",25,"Civil");
        Student student10=new Student(3,"Rutika",25,"ETC");
        Student student11=new Student(5,"shilpa",25,"Civil");
        Student student12=new Student(4,"nikita",25,"CS");


        stud.add(student1);
        stud.add(student2);
        stud.add(student3);
        stud.add(student4);
        stud.add(student5);
        stud.add(student6);
        stud.add(student7);
        stud.add(student8);
        stud.add(student9);
        stud.add(student10);
        stud.add(student11);
        stud.add(student12);

        return stud;
    }

    public  HashSet<Engineer> engineerHashSet(){
        HashSet<Engineer> engineers=new HashSet<>();
        Engineer engineer1=new Engineer("Rohit","Mechanical",25,98000.56);
        Engineer engineer2=new Engineer("Rashi","CS",22,85000.54);
        Engineer engineer3=new Engineer("Sourbh","Civil",26,78000.58);
        Engineer engineer4=new Engineer("Rohit","Mechanical",25,98000.56);
        Engineer engineer5=new Engineer("Chaitali","ETC",27,950000.00);
        Engineer engineer6=new Engineer("Sourbh","Civil",26,78000.58);
        Engineer engineer7=new Engineer("Rashi","CS",22,85000.54);
        Engineer engineer8=new Engineer("Rohit","Mechanical",25,98000.56);
        Engineer engineer9=new Engineer("Sourbh","Civil",26,78000.58);
        Engineer engineer10=new Engineer("Rohit","Mechanical",25,98000.56);

        engineers.add(engineer1);
        engineers.add(engineer2);
        engineers.add(engineer3);
        engineers.add(engineer4);
        engineers.add(engineer5);
        engineers.add(engineer6);
        engineers.add(engineer7);
        engineers.add(engineer8);
        engineers.add(engineer9);
        engineers.add(engineer10);
        return engineers;
    }
public HashSet<Doctor> doctorHashSet(){
        HashSet<Doctor> doctors=new HashSet<>();
        Doctor doctor1=new Doctor("Dr.Nitin","MBBS","Dermologist",2.5,89000.52);
        Doctor doctor2=new Doctor("Dr.Chetan","BAMS","ETE",8.5,100000.00);
    Doctor doctor3=new Doctor("Dr.Sanjay","BAMS","Knee specialist",5.5,100000);
    Doctor doctor4=new Doctor("Dr.Nitin","MBBS","Dermologist",2.5,89000.52);
        Doctor doctor5=new Doctor("Dr.Shivani","MBBS","Gynologist",10.5,150000);
    Doctor doctor6=new Doctor("Dr.Nitin","MBBS","Dermologist",2.5,89000.52);
    Doctor doctor7=new Doctor("Dr.Chetan","BAMS","ETE",8.5,100000.00);
        Doctor doctor8=new Doctor("Dr.Sanjay","BAMS","Knee specialist",5.5,100000);
    Doctor doctor9=new Doctor("Dr.Shivani","MBBS","Gynologist",10.5,150000);
    doctors.add(doctor1);
    doctors.add(doctor2);
    doctors.add(doctor3);
    doctors.add(doctor4);
    doctors.add(doctor5);
    doctors.add(doctor6);
    doctors.add(doctor7);
    doctors.add(doctor8);
    doctors.add(doctor9);
    return doctors;
}
    public static void main(String[] args) {
        AssignmentEqualsAndHashCode obj=new AssignmentEqualsAndHashCode();
        HashSet<Student> students=obj.studentSet();
        System.out.println("..........Equals and hashcode method for student...........");
        for (Student var:students)
        {
            System.out.println("Student rollno is\t" +var.getRollNo()+ "\tName of student\t"+var.getName()+"\tage oof student\t"+var.getAge()+"\tsection oof student\t "+var.getSection());
        }
        System.out.println();
        HashSet<Engineer> engineer=obj.engineerHashSet();
        System.out.println("..........Equals and hashcode method for Engineer...........");
        for (Engineer var:engineer)
        {
            System.out.println("Engineer name is\t"  +var.getName()+ "\t Department is\t" +var.getDept() + "\tage is\t" +var.getAge()+"\tSalary is\t"+var.getSal());
        }
        System.out.println();
        HashSet<Doctor> doctors=obj.doctorHashSet();
        System.out.println("..........Equals and hashcode method for Doctor...........");
        for (Doctor var:doctors)
        {
            System.out.println("Doctor name\t"+var.getDrName()+"\tDegree\t"+var.getDegree()+"\tSpecialization\t"+var.getSpecialization()+"\tSalary\t"+var.getmSal());
        }



    }
}
