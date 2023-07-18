package conditional_statements;

public class AssignmentDemoANDOperator {
    public static void main(String[] args) {
        int marks = 60;
        String section = "Science";
        if (marks >= 60 && section == "Science") {
            System.out.println("Students got 60% or More than 60% Marks will get science stream");
        } else {
            System.out.println("Student will not get science stream");
        }
        section = "Arts";
        if ( marks >= 60 && section == "Science"){
            System.out.println("Students will not get science Stream");
        } else {
            System.out.println("Students will not get science stream");
        }

        marks = 50;
        section = "Science";
        if (marks >=60 && section == "Science") {
            System.out.println("Students will get Science stream");
        } else {
            System.out.println("Students will not get Science Stream");
        }
        marks = 40;
        section = "Commerce";
        if (marks >=60 && section == "Science"){
            System.out.println("Students will get Science Stream");
        } else {
            System.out.println("Students will not get Science stream");
        }

        int age = 18;
        String state = "UP";
        if (age >= 18 && state == "UP") {

            System.out.println("You are eligible for voting in UP");
        } else {
            System.out.println("You are NOT eligible for voting in UP");
        }

        state = "MP";
        if (age >= 18 && state == "UP") {

            System.out.println("You are eligible for voting in UP");
        } else {
            System.out.println("You are NOT eligible for voting in UP");
        }


        age = 17;
        state = "UP";
        if (age >= 18 && state == "UP") {

            System.out.println("You are eligible for voting in UP");
        } else {
            System.out.println("You are NOT eligible for voting in UP");
        }

        age = 16;
        state = "MP";
        if (age >= 18 && state == "UP") {

            System.out.println("You are eligible for voting in UP");
        } else {
            System.out.println("You are NOT eligible for voting in UP");
        }
        }

    }
