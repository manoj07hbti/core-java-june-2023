package class_conditional_statements;

public class ANDOpreator {
    public static void main(String[] args) {
        int age=18;
        String city="Pune";

        //SYNTAX :if(condition1 op condition2 op condition3......){
        //TRUE & TRUE =TRUE
        // }
        if(age>=18 && city=="Pune"){

            System.out.println("TRUE  :Eligible for Casting the Vote in Pune");
        }else {

            System.out.println("Not Eligible for Casting the Vote in Pune");
        }

        //TRUE & FALSE =FALSE
        city="Agra";
        if(age>=18 && city=="Pune"){

            System.out.println("Eligible for Casting the Vote in Pune");
        }else {

            System.out.println("FALSE :Not Eligible for Casting the Vote in Pune");
        }

        //FALSE & TRUE =FALSE
        age=17;
        city="Pune";
        if(age>=18 && city=="Pune"){

            System.out.println("Eligible for Casting the Vote in Pune");
        }else {

            System.out.println("FALSE :Not Eligible for Casting the Vote in Pune");
        }


        //FALSE & FALSE =FALSE
        age=17;
        city="Agra";
        if(age>=18 && city=="Pune"){

            System.out.println("Eligible for Casting the Vote in Pune");
        }else {

            System.out.println("FALSE :Not Eligible for Casting the Vote in Pune");
        }


    }
}
