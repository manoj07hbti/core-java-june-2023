package Test_22oct;

import Practise.Primeprint;

public class Prime_number {


    public static void prime(int number){

        for (int i=2;i<=number;i++){
            int temp=0;
            for(int j=2;j<i;j++){

                if(i%j==0){
                    temp++;

                }
            }
            if (temp==0){

                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Primeprint.prime(20);
    }
}








