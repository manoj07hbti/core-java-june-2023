package test_22october;

public class Demo_PrimeNumber {


    //Make the Method & Call Method Project of Prime Number==========================
    public void checkPrime(){
        int num=15;
        int count=0;
        for(int i=1; i<=num;i++){
            count=0;
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==0){
                System.out.println("Given Number is Prime Number:- "+i);


            }
        }

    }

    public static void main(String[] args) {
        Demo_PrimeNumber obj = new Demo_PrimeNumber();
        obj.checkPrime();
    }
}
