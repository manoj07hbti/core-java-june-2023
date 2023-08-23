package Scanner;

import java.util.Scanner;

public class Calciapp {

    public int add(int a,int b){

        return a+b;
    }

    public int sub(int a,int b){

        return a-b;
    }

    public int multiply(int a,int b){

        return a*b;
    }

    public int divide(int a,int b){

        return a/b;
    }






    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("please enter value of a:");
        int a=scanner1.nextInt();

        System.out.println("please enter value of b:");
        int b=scanner1.nextInt();

        System.out.println("please enter you choice: 1 add,2 sub,3 multiply,4 divide");

        Calciapp obj=new Calciapp();

        int choice=scanner1.nextInt();

        if (choice==1) {

            int result = obj.add(a, b);
            System.out.println("addition is:" + result);
        }else if (choice==2){
            int result=obj.sub(a,b);
            System.out.println("sub is:"+result);
        }else if (choice==3){
            int result=obj.multiply(a,b);
            System.out.println("multiply is:"+result);
        }else if (choice==4){
            int result=obj.divide(a,b);
            System.out.println("divide is :"+result);
        }







    }
}
