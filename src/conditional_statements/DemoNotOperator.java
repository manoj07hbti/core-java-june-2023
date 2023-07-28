package conditional_statements;

public class DemoNotOperator {

    public static void main(String args[]) {

        int ram= 8;

        if(!(ram<9)){
           System.out.println("The RAM of the CPU is 8");
        }else{
            System.out.println("The RAM of the CPU is not 8");
        }

        String Brand= "IBM";

        if(!(Brand!="PUMA")){
            System.out.println("The Brand is IBM");
        }else{
            System.out.println("The Brand is not IBM");
        }
    }
}
