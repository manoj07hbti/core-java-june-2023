package conditional_statements;

public class DemoANDOperator {

    public static void main(String[] args) {

        int age=18;
        String city="Pune";

        //SYNTAX : if(condition1 op condition2 op condition3.........){
        //
        //            }
//1.   TRUE && TRUE = TRUE
        if(age>=18 && city=="Pune"){

            System.out.println("TRUE : You are eligible for voting in Pune .....");
        }else {
            System.out.println("You are NOT eligible for voting in Pune .....");
        }

//2.   TRUE && FALSE= FALSE
       city="Agra";
        if(age>=18 && city=="Pune"){

            System.out.println("You are eligible for voting in Pune .....");
        }else {
            System.out.println("FALSE : You are NOT eligible for voting in Pune .....");
        }

//3.   FALSE && TRUE= FALSE

        age=17;
        city="Pune";
        if(age>=18 && city=="Pune"){

            System.out.println("You are eligible for voting in Pune .....");
        }else {
            System.out.println("FALSE : You are NOT eligible for voting in Pune .....");
        }
//4.   FALSE & FALSE= FALSE
        age=17;
        city="Agra";
        if(age>=18 && city=="Pune"){

            System.out.println("You are eligible for voting in Pune .....");
        }else {
            System.out.println("FALSE : You are NOT eligible for voting in Pune .....");
        }

    }
}
