package sefstudy;

import java.util.Scanner;

public class PracticeIfEseusingmethd{
     public boolean evenodd(int n,int m){



         if (n<m)
         {

            // System.out.println("lesser");
             return true;
         }
         return false;
    }

    public static void main(String[] args) {
        PracticeIfEseusingmethd pm=new PracticeIfEseusingmethd();
      //*  Scanner sc=new Scanner(System.in);
     //   System.out.println("Enter the value of n");
       // int n=sc.nextInt();
        //System.out.println("Enter the value of m");
        //int m=sc.nextInt();

        boolean result= pm.evenodd(4,8);
       // int result=pm.evenodd(4,8);
     //   System.out.println(result);

        if (result)
        {
            System.out.println("lesser");
        }
        else {
            System.out.println("greater");
        }
    }

}
