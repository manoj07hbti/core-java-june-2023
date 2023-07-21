package conditional_package;

public class ClassNestedIf {
    public static void main(String[] args) {
        int number = 5;
        if (number % 3 == 0) {
            if (number > 0) {

            }
            System.out.println("given number is even number :+number");
        } else {
            System.out.println("given number is odd number :" + number);
        }
        if (number % 2 == 0) ;

        System.out.println("please enter valid number:");

        int marks = 60;
        String section = "Science";
        //SYNTAX :if(condition1 op condition 2 op condition3...){
        //
        //1. TRUE & TRUE= TRUE
        if (marks >= 60 && section == "Science") {
            System.out.println("you are passed first division with Science.....true");
        } else {
            System.out.println("you are not  passed first  in Fidivision with Science");
        }
        section = "Arts";
        if (marks >= 60 && section == "Arts") {
            System.out.println("you are passed first division with Arts...");
        } else {
            System.out.println("you are not pass first division with Arts ");
        }
        marks = 30;
        section = "science";
        if (marks >= 40 && section == "science") {
            System.out.println("you are passed first division with science");

        } else {
            System.out.println("you are not pass first division with science");}

        marks = 30;
        section = "Arts";
        if (marks > 40 && section == "science") {
            System.out.println("you are passed first division with science");
        }else{
            System.out.println("you are not pass first division with science......false");
        }
        int age = 18;
        String state = "UP";
        if (age >=17 && state=="UP"){
            System.out.println("you are eligible for vote in UP....TRUE");

        }else {
            System.out.println("you are not eligible for vote");
        }
        state = "UK";
        if (age > 17 && state== "Uttarakhand"){
            System.out.println("you are not eligible for vote in utterkhand");
        }else{
            System.out.println("you are not eligible for voting in utterakhand.....false");
        }
        age = 17;
        if (age >=18 && state== "up"){
            System.out.println("you are  eligible for voting in up");
        }else{
            System.out.println("you are not eligible for voting in up....false");
        }



    }

}

