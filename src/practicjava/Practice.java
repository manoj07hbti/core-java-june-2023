package practicjava;

public class Practice {
    public static void main(String[] args) {
        int number = 12;
        int square = number * number;
        System.out.println("The value of  square " + number + " is : " + square);

        number = 9;
        int cube = number * number * number;
        System.out.println("The value of  cube " + number + " is : " + cube);

        double amount = 100000;
        double percentage = 100000 * 5 / 100;
        System.out.println("  5 % of   " + amount + " is : " + percentage);

        amount = 20000;
        percentage = 20000 * 5 / 100;
        System.out.println("5 % of " + amount + " is : " + percentage);

        amount = 5000;
        percentage = 5000 * 2 / 100;
        System.out.println("2 % of " + amount + " is : " + percentage);

        number = 2;
        cube = number * number * number;
        System.out.println("The cube of " + number + " is  : " + cube);

        number = 5;
        square = number * number;
        System.out.println(" The square of " + number + " is : " + square);

        int age;
        age = 45;
        System.out.println("age of the person is : " + age);

        String city;
        city = " Aurangabad ";
        System.out.println(" person is belongs from : " + city);

        double price;
        price = 49.99999;
        System.out.println("price of the product is : " + price);

        double number1 = 500000;
        double percentage1 = 500000 * 5 / 100;
        System.out.println("the percentage of 5000000 at 5% is : " + percentage1);

        int number2 = 20;
        int square1 = number2 * number2;
        System.out.println(" the square value " + number2 + " is : " + square1);

        int number4 = 50;
        int square2 = number4 * number4;
        System.out.println(" the square value of " + number4 + " is : " + square2);

        int number5 = 45;
        int square3 = number5 * number5;
        System.out.println("the value of square3 " + number5 + " is : " + square3);

        int number6 = 6;
        int square6 = number6 * number6;
        System.out.println(" the value of square " + number6 + " is : " + square6);

        int number7 = 6;
        int cube7 = number7 * number7 * number7;
        System.out.println(" the value of cube " + number7 + " is : " + cube7);

        int number8 = 4;
        int cube8 = number8 * number8 * number8;
        System.out.println(" the value of " + number8 + " is : " + cube8);

        int age5;
        age5 = 18;
        System.out.println("the age of the person is  : " + age5);

        String place;
        place = "Basti";
        System.out.println("the name if the place is : " + place);

        int i = 1;
        i++;
        System.out.println(" increment of i is : " + i);

        int a = 2;
        int b = 2;
        int sum = a + b;

        System.out.println("sum of a and b is : " + sum);

        int marks = 32;
        if (marks > 0)
            if (marks >= 33) {
                System.out.println("person will pass");
            } else {
                System.out.println("person will fail");
            }
        else {
            System.out.println(" write the valid number");
        }
        int age1 = 27;
        String cityname = "Agra";
        if (age1 >= 18 && cityname == "Agra") {
            System.out.println("you are eligible for voting in Agra");
        }else{
            System.out.println("you are not eligible for voting in Agra");
        }
        int marks1=75;
        String subject="science";
        if(marks1>=60 && subject=="science"){
            System.out.println("student get first division in science stream : " +marks1);
        }else{
            System.out.println("student get fail in science stream : " + marks1);
        }
    }
}
