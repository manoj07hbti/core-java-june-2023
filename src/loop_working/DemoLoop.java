package loop_working;

public class DemoLoop {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
/*  SYNTAX: INCREMENT FOR LOOP
        for (start_condition; expression; increment){
            //CODE
        }*/

        for(int i=1; i<=5; i++){

            System.out.println("Hello inside for Loop..."+i);
        }
/*  SYNTAX: DECREMENT FOR LOOP
        for (start_condition; expression; decrement){
            //CODE
        }*/

        for(int i=10; i>0 ;i--){

            System.out.println("Decrement for loop: "+i);
        }

        for(int i=2; i>-3; i--){

            System.out.println(i);
        }

    }
}
