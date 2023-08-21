package method.return_type;

import method.input_parameter.OddEvenNumberMethod;

public class OddEvenNumber {


    public int findOddEven(int number) {// TODO <--------with input

        return number;
    }
    public int findEvenOdd(){// TODO <--------without input
        int number=21;
        return number;
    }
    public static void main(String[] args) {
        OddEvenNumber obj = new OddEvenNumber();
        int output = obj.findOddEven(3);
        if (output % 2 == 0) {
            System.out.println("Given number is Even :" + output);
        } else {
            System.out.println("Given number is Odd :" + output);
        }
        int output2=obj.findEvenOdd();
        if (output2%2==0){
            System.out.println("Given number is Even :" + output2);
        }else {
            System.out.println("Given number is Odd :" + output2);
        }
    }

}
