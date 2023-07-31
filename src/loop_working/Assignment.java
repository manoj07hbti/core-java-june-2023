package loop_working;

public class Assignment {

    public static void main(String[] args) {

        for(int i=1; i<=100; i++){

            if(i%2==0){

                System.out.println("Even number : "+i);
            }else {
                System.out.println("ODD number : "+i);

            }


        }

        int j=1;
        while(j<=100){
            if(j%2==0){

                System.out.println("While Loop: Even number : "+j);
            }else {
                System.out.println("While Loop: ODD number : "+j);

            }


            j++;
        }


    }
}
