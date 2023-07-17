package class_conditional_statements;

public class IFday1 {
    public static void main(String[] args) {
        //SYNTEX : if(condition){ code to be executed } else {}

        int age = 17;

        if (age < 18) {

            System.out.println("Person is Eligible for Casting the vote");

        }

        String city = "Delhi";

        if (city == "Delhi") {
            System.out.println("You belongs to Capital");
        }
        if(age<18){

            System.out.println("Person is not Eligible for Casting Vote");

        }


    }
}
