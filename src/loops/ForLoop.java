package loops;

public class ForLoop{

    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

        /* SYNTAX : INCREMENT FOR LOOP
        for(start_condition;expression;increment){
        //CODE
        }*/
       for(int i=1;i<=5;i++){
           System.out.println("INCREMENT FOR LOOP :"+i);
       }

       /* SYNTAX : DECREMENT FOR LOOP
        for(start_condition;expression;decrement){
        //CODE
        }*/

       for(int i=10;i>0;i--){
           System.out.println("DECREMENT FOR LOOP :"+i);
       }
    }
}
