package conditional_statements;

public class DemoIfDay1 {
    public static void main(String[] args) {
        //SYNTAX:
        //    if(expression/condition){
        //          //CODE
        //    }

        int age=17;

        if(age > 18){

            System.out.println("Person is eligible for voting");
        }

        String city="Pune";

        if(city == "Pune"){
            System.out.println("You belongs to Maharashtra state");
        }
        // if a person is below 18 years then he should get message not eligible for voting ...
        if(age<18){

            System.out.println("You are not eligible for voting ....");
        }



    }


}
