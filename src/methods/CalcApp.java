package methods;

import java.util.Scanner;

public class CalcApp {

    public int add(int a, int b){

        return a+b;
    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter value of a:");
        int a=scanner.nextInt();

        System.out.println("Please enter value of b:");
        int b=scanner.nextInt();

        System.out.println("Please enter you choice: 1 Add, 2 Sub, 3 multi and 4 Divide");
        CalcApp obj= new CalcApp();
        int choice= scanner.nextInt();

        if(choice==1){
            int result=obj.add(a,b);
            System.out.println("Addition is : "+result);
        } else if (choice==2) {
            //call sub
        } else if (choice==3) {
            // call multi
        } else {
           // call divide
        }


    }
}
