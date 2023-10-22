package oct_22_test7;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {

    public void factorial(int n)
    {

        int fact=1;
        for (int i=n;i>1;i--)
        {
            fact=fact*i;
        }
        System.out.println("factorial of number is:"+fact);
    }

public void pattern(int m)
{

    for (int i=0;i<m;i++)
    {
        System.out.println();
        for (int j=0;j<=i;j++)
        {

            System.out.print("*" );
        }
    }
}
public void countOccurrenceAr(int arr[]){

    Arrays.sort(arr);
    for (int i=0; i<arr.length-1;i++)
    {
        if (i!=arr.length-1)
        {
            int c=1;
            for (int j=i+1;j< arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    c++;
                }else {
                    break;
                }
                System.out.println(arr[i]+"-->"+c);
                i = i + (c - 1);

            }
        }
    }
}

public void primeNo()
{
    {


        for (int no = 10; no <= 20; no++) {
            int temp = 0;
            for (int i = 2; i <= no - 1; i++) {
                while (no % i == 0) {
                    temp = temp + 1;
                    break;
                }
            }

            if (temp == 0) {
                System.out.println("prime no:\t" + no);
            } else {
                System.out.println("Not prime no:\t" + no);
            }
        }
    }
}
public void armstrongNo(int num)
{
    int arm=0;
    int rem,count;
   count=num;
    while (num>0)
    {
        rem=num%10;
        arm=(rem*rem*rem)+arm;
       num= num/10;
    }
    if (count==arm)
    {
        System.out.println("Given number is Armstrong: "+arm);
    }
    else {
        System.out.println("Given number is not Armstrong: "+arm);
    }
}
    public static void main(String[] args) {
        Test7 t7=new Test7();
  System.out.println("Enter the number");
  Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
       t7.factorial(n);
       System.out.println();
     System.out.println("Pattern program");
    Scanner sc1=new Scanner(System.in);
      int m= sc1.nextInt();
      t7.pattern(m);
      System.out.println();
t7.primeNo();
        System.out.println();
        System.out.println("Enter the number");
        Scanner sc4=new Scanner(System.in);
        int num= sc4.nextInt();
        t7.armstrongNo(num);

       System.out.println();
       int arr[]={1,2,3,1,4,5,2,3,2,5,5,2,7,8};
       t7.countOccurrenceAr(arr);




    }
}
