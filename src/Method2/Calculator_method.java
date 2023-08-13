package Method2;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Calculator_method {


    public void addition() {
        int a = 4;
        int b = 8;

        int result = a + b;

        System.out.println("sum of given number is :" + result);
    }

        public void subtraction() {
            int p = 9;
            int q = 6;

            int result = p - q;

            System.out.println("subtraction of given number:" + result);
        }

        public void multiplication(){
        int c =3;
        int d=8;

        int result=c*d;

        System.out.println("multiplication of given number:"+result);
        }

        public void divide(){
        int y=9;
        int z=3;

        int result=y /z;

        System.out.println("divide of given number:"+result);
        }

    public static void main(String[] args) {

        Calculator_method calculator1=new Calculator_method();

        calculator1.addition();
        calculator1.subtraction();
        calculator1.multiplication();
        calculator1.divide();

    }

        }



