package Break_and_continue_loop;

public class DemoBreak {
    public static void main(String[] args) {

        for (int i=1; i<= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println("this is for loop...." + i);

            int array[]={1,2,3,4,5,6,7,8,9,10};

            for(int variable: array){
                System.out.println("finding number 7 in array, checking:" + variable);
                if (variable==7){
                    System.out.println("given number 7 is found");
                    break;
                }
            }

        }


        }

    }