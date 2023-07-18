package conditional_statements;

public class DemoANDOperator {

    public static void main(String[] args) {

        int marks =60;
        String Section = "Science";
     //SYNTAX : if(condition1 op condition2 op condition3.........)

//1.TRUE && TRUE = TRUE 1*1=1

        if(marks>=60 && Section == "Science"){
         System.out.println("True- you have clear the exam");
        }else{
            System.out.println("True-In the Section of Science");
        }

//2.TRUE && FALSE = FALSE 1*0=0
        marks=60;
        Section ="Arts";
        if(marks>=60 && Section == "Science"){
            System.out.println("True- you have clear the exam");
        }else{
            System.out.println("False- In the Section of Arts");
        }

//3.FALSE && TRUE = FALSE 0*1=0
         marks=50;
        Section="Science";
        if(marks>=40 && Section == "Science"){
            System.out.println("False you have not clear the exam");
        }else{
            System.out.println("True In the Section of Science");
        }

//4.FALSE && FALSE = FALSE 0*0=0
        marks=50;
        Section= "Arts";
        if(marks>=50 && Section == "Atrs"){
            System.out.println("False you have not clear the exam");
        }else{
            System.out.println("False In the Section of Science you in section of Ats");
        }

//2.Assignment for voting

      int age=18;
        String State= "MH";
//1.TRUE && TRUE = TRUE 1*1=1

        age = 18;
        State="MH";
        if(age>=18 && State == "MH"){
            System.out.println("True- you have eligible for voting in MH");
        }else{
            System.out.println("True- You are not eligible for voting in MH");
        }

//2.TRUE && FALSE = FALSE 1*0=0

      age=18;
        State="UP";
        if(age>=18 && State == "MH"){
            System.out.println("True- you have eligible for voting in MH");
        }else{
            System.out.println("False- You are not eligible for voting in MH");
        }

//3.FALSE && TRUE = FALSE 0*1=0

      age=17;
        State="MH";
        if(age>=17 && State == "MH"){
            System.out.println("False- you have eligible for voting in MH");
        }else {
            System.out.println("True- You are not eligible for voting in MH");
        }
//4.FALSE && FALSE = FALSE 0*0=0

       age=17;
        State="UP";
        if(age>=17 && State == "MH"){
            System.out.println("False- you have eligible for voting in MH");
        }else {
            System.out.println("False - You are not eligible for voting in MH");
        }
    }

}
