package class_conditional_statements;

import java.sql.SQLOutput;

public class NestedIf {
    public static void main(String[] args) {

        int num = 30;

        if (num > 0) {

            if (num % 2 == 0) {

                System.out.println("Number is Even: " + num);
            } else {

                System.out.println("Number is Odd: " + num);
            }
        }else{
            System.out.println("Please Enter Valid Number");
        }





        int age =-1;
        if (age > 0) {

            if(age>=18){
                System.out.println("Eligible for Casting the Vote");
            }else {
                System.out.println("Not Eligible for Casting the Vote");
            }
        }else System.out.println("Please Enter the Valid Age");
        }
        }




