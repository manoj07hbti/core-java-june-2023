package loops;

public class EvenNumberWhileLoop {


    public static void main(String[] args) {

        int i =2;

        while (i <= 100) {

            System.out.println("Even Numbers Are: " + i);
            if(i%2==0)
            i++;
            i+=1;

        }

    }
}
/*
        int number=100;
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println("Even Numbers Are :"+i);
            }



 int i=0;
        System.out.println("Even numbers");
        while(i<=10)
        {
            int num=0;
            System.out.println(num);
            i+=1;<------------------------this is key point for print even and odd number
            num+=2;
        }
        }

    */

