package method.input_parameter;

import java.sql.SQLOutput;

public class OddEvenNumberMethod {
    // TODO write a code to find odd even with the help of input parameter
    // TODO  Syntax : access_specifier return_type  method_name (Datatype varName....) { CODE..}

    public void findOddEven(int number) {

        if (number % 2 == 0) {
            System.out.println("Given Number is Even :" + number);
        } else {
            System.out.println("Given Number is Odd :" + number);
        }
    }

    public static void main(String[] args) {
        OddEvenNumberMethod obj = new OddEvenNumberMethod();
        obj.findOddEven(1);
        obj.findOddEven(2);
        obj.findOddEven(3);
        obj.findOddEven(4);
        obj.findOddEven(5);
        obj.findOddEven(6);
        obj.findOddEven(7);
        obj.findOddEven(8);
        obj.findOddEven(9);
        obj.findOddEven(10);
        obj.findOddEven(11);
        obj.findOddEven(12);
        obj.findOddEven(13);
        obj.findOddEven(14);
        obj.findOddEven(15);
        obj.findOddEven(16);
        obj.findOddEven(17);
        obj.findOddEven(18);
        obj.findOddEven(19);
        obj.findOddEven(20);


    }

}
