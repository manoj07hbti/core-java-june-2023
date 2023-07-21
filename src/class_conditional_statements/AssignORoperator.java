package class_conditional_statements;

public class AssignORoperator {

    public static void main(String[] args) {

        String company="IBM";
        int ram=128;

        // TRUE || TRUE = TRUE

        if(company=="IBM" || ram>=8){

            System.out.println("TRUE:Good Configuration");
        }else {
            System.out.println("Average Configuration");
        }

        // TRUE || FALSE = TRUE

        ram=4;
        if(company=="IBM" || ram>=8){

            System.out.println("TRUE:Good Configuration");
        }else {
            System.out.println("Average Configuration");
        }

        // FALSE || TRUE = TRUE


        company="WD";
        ram=256;
        if(company=="IBM" || ram>=8){

            System.out.println("TRUE:Good Configuration");
        }else {
            System.out.println("Average Configuration");
        }

        // FALSE || FALSE = TRUE



        company="WD";
        ram=4;

        if(company=="IBM" || ram>=8){

            System.out.println("TRUE:Very high price");
        }else {
            System.out.println("FALSE:Average price");
        }

    }

}
