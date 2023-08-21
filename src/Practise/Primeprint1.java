package Practise;

public class Primeprint1 {

    public static void prime(int number){

        for (int i=2;i<=number; i++){

            int temp=0;

            for (int j=2;j<=i; j++){


                if (i%j==0){
                    temp++;
                }
            }
            if(temp==0){

                System.out.println(i+" ");
            }

        }
    }

    public static void main(String[] args) {
        Primeprint1.prime(200);
    }
}
