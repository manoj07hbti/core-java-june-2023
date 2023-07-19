package class_conditional_statements;

public class AssignANDop2 {

    public static void main(String[] args) {
        int age = 18;
        String city = "Agra";

        //SYNTAX :if(condition1 op condition2 op condition3......){
        //TRUE & TRUE =TRUE
        // }
        if (age >= 18 && city == "Agra") {

            System.out.println("TRUE  :Eligible for Casting the Vote in Agra");
        } else {

            System.out.println("Not Eligible for Casting the Vote in Agra");
        }

        //TRUE & FALSE =FALSE
        city = "Mathura";
        if (age >= 18 && city == "Agra") {

            System.out.println("Eligible for Casting the Vote in Agra");
        } else {

            System.out.println("FALSE :Not Eligible for Casting the Vote in Agra");
        }

        //FALSE & TRUE =FALSE
        age = 17;
        city = "Agra";
        if (age >= 18 && city == "Agra") {

            System.out.println("Eligible for Casting the Vote in Agra");
        } else {

            System.out.println("FALSE :Not Eligible for Casting the Vote in Agra");
        }


        //FALSE & FALSE =FALSE
        age = 17;
        city = "Delhi";
        if (age >= 18 && city == "Agra") {

            System.out.println("Eligible for Casting the Vote in Agra");
        } else {

            System.out.println("FALSE :Not Eligible for Casting the Vote in Agra");
        }


    }
}