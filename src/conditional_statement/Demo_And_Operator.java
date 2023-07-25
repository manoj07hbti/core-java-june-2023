package conditional_statement;

public class Demo_And_Operator {

    public static void main(String args []){

       int marks = 60;
       String section = "Science";

       if ( marks>=60 && section=="Science"){

          System.out.println("You are passed first division with science.....TRUE");

       }else {
           System.out.println("You are not passed first division with science.");
       }


       section = "Arts";

       if (marks>=60 && section=="Science"){

           System.out.println("You are passed first division with arts.");

       }else {
           System.out.println("You are not passed first division with arts......FALSE");
       }


        marks = 30;
        section = "Science";

       if (marks>=40 && section=="Science"){

           System.out.println("You are passed first division with science");

       }else {
           System.out.println("You are not passed first division with science......FALSE");
       }


       marks =30;
       section = "Arts";

       if (marks>=40 && section=="Science"){

           System.out.println("You are passed first division with science");

       }else {
           System.out.println("You are not passed first division with science.......FALSE");
       }


       int age = 18;
       String state = "UP";

       if (age>=17 && state=="UP"){

           System.out.println("You are eligible for voting in UP.....TRUE");

       }else {
           System.out.println("You are not eligible for voting.");
       }



       state = "MP";
       if (age>= 17 && state== "UP"){

           System.out.println("You are eligible for voting in UP");

       }else {
           System.out.println("You are not eligible for voting in MP.....FALSE");
       }


       age = 17;

       if (age>=18 && state== "UP"){

           System.out.println("You are eligible for voting in UP");
       }else {
           System.out.println("You are not eligible for voting in UP....FALSE");
       }


       age = 17;
       state = "MP";

       if (age>=18 && state == "UP"){

           System.out.println("You are eligible for voting in UP");

       }else {
           System.out.println("You are not eligible for voting in UP....FALSE");
       }


       double price = 66.7;
        String product ="Pen";
       if (price>= 67.8 && product == "pen"){
           System.out.println("Pen price is normal price.");
       }else {
           System.out.println("Pen price is not normal price.");
       }






    }
}
