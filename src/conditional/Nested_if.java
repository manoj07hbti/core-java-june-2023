package conditional;

public class Nested_if {
    public static void main(String[] args) {
        int age = 19;
        if (age >0) {

            if (age >= 18) {
                System.out.println("Eligible for voting ");
            } else {
                System.out.println("Not Eligible for voting");
            }

           }else {
            System.out.println("Please enter valid number for age");
        }

        String city = "Agra";
        if (city=="Agra"){
            if(age>=18){
                System.out.println("Person Eligible for voting ");
            }else{
                System.out.println("Not eligible  for voting ");
            }
        }else {
            System.out.println("Voting allowed only for Agra person");
        }


            }
        }


