package conditional_statements;

public class Practiseconditionalstatement {
    public static void main(String[] args) {
        int marks=65;
        String stream="science";

        if (marks>=60 & stream=="science") {
            System.out.println("this student is bright future");
        }
        else {
            System.out.println("this student is not bright future");
        }
        stream="Art";
        if (marks>=60 & stream=="Science") {
            System.out.println("THIS STUDENT IS BRIGHT FUTURE");
        }
        else {
            System.out.println("THIS STUDENT IS NOT BRIGHT FUTURE");
        }

        marks=55;

        if (marks>=60 & stream=="Science") {
            System.out.println("THIS STUDENT IS BRIGHT FUTURE");
        }
        else {
            System.out.println("THIS STUDENT IS NOT BRIGHT FUTURE");
        }
        marks=55;
        stream = "Art";

        if (marks>=60 & stream=="Science") {
            System.out.println("THIS STUDENT IS BRIGHT FUTURE");
        }
        else {
            System.out.println("THIS STUDENT IS NOT BRIGHT FUTURE");
        }


        }



    }

