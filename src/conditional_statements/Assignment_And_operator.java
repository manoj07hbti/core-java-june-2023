package conditional_statements;

public class Assignment_And_operator {
    public static void main(String[] args) {
        //True&True=True
        int marks = 75;
        String subject = "science";
        if (marks >= 60 && subject == "science") {
            System.out.println("student get first division in science stream : " + marks);
        } else {
            System.out.println("student get fail in science stream : " + marks);
        }
        //True&&False=False
        marks = 75;
        subject = "science";
        if (marks >= 60 && subject == "Arts") {
            System.out.println("you are a student of science stream and get 60% above : " + marks);
        } else {
            System.out.println(" you are get 60% above but you are not a student of science stream : " + marks);
        }
        //False&&True=False
        marks = 32;
        subject = "science";
        if (marks >= 60 && subject == "science") {

            System.out.println("you get first division in science section");
        }else{
            System.out.println("student get fail but section is science ");

        }
        //False && False=False
        marks=12;
        subject="Arts";
        if(marks>=60 && subject=="science"){
            System.out.println("you are a student of science stream and get first division above 60%");
        }else{
            System.out.println("you are not a student of science stream and not get first division ");
        }
        //voting Eligible;

        int age=22;
        String state="UP";
        if(age>=18 && state=="UP"){
            System.out.println("True :person is eligible for voting in up at age : " + age);
        }else{
            System.out.println("person is not eligible for voting in up at age : " + age);
        }
         age=25;
        state="MP";
        if(age>=18 && state=="UP"){
            System.out.println("person is eligible for voting in UP at age : " + age);
        }else{
            System.out.println("false: person is not eligible for voting on the other state : " + age);

            age=12;
            state="UP";
            if(age>=18 && state=="UP"){
                System.out.println("you are eligible for voting in UP at age : " + age);
            }else{
                System.out.println("false :person is not eligible for voting in up at age : " + age);
            }
        }
        age=15;
        state="MP";
        if(age>=18 && state=="UP"){
            System.out.println("person is eligible for voting in UP at : " + age);
        }else{
            System.out.println("false :person is not eligible for voting in UP at age : " + age);
        }
    }
}