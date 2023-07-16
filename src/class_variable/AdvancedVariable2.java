package class_variable;

import java.sql.SQLOutput;

public class AdvancedVariable2 {
    public static void main(String[] args) {

        int a=3;
        int b=9;
        int sum=a+b;
        System.out.println("sum of a and b is "+sum);

        int sub=a-b;
        System.out.println("sub of a and b is "+sub);

        int multi=a*b;
        System.out.println("multi of a and b is "+multi);

        double divide=(double) a/b;
        System.out.println("div of a and b is "+divide);

        int i=5;
        i++; // Increment Operator i=i+1

        System.out.println("Increment is "+i);

        int j=9;
        j--; // decrement operator i=i-1

        System.out.println("Decrement is "+j);


        int p=56;
        int q=79;

        p+=q; // x=x+y

        System.out.println("Value of p: "+p);

        p-=q; //x=x-y

        System.out.println("Value of p after calculation:"+p);

        p*=q; //x=x*y

        System.out.println("Value of p after calculation:"+p);

        p/=q; //x=x/y

        System.out.println("Value of p after calculation:"+p);

        System.out.println();


    }
}
