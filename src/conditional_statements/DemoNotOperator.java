package conditional_statements;

public class DemoNotOperator {
    public static void main(String[] args) {

        int age=17;

        if(!(age<18)){

            System.out.println("Eligible for voting...");
        }else {

            System.out.println("Not Eligible for voting ...");
        }

        String city="Delhi";

        if( !(city!="Pune")){

            System.out.println("You belongs to Pune ....");
        }else {

            System.out.println("You do not belongs to Pune ....");
        }




    }
}
