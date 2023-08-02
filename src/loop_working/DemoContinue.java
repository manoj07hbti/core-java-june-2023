package loop_working;

public class DemoContinue {

    public static void main(String[] args) {

        for(int i=1; i<=10; i++){

            if(i==3 || i==10){
                continue;
            }
            System.out.println("Demo Continue of loop:"+i);

        }

    }
}
