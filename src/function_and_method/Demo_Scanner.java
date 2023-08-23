package function_and_method;

import java.util.Scanner;

public class Demo_Scanner {

    public void readInput(){  //( Created a Scanner method that would read a String input.....)
        Scanner obj = new Scanner(System.in); // (When will create the object of use scanner...)
        System.out.println("Please inter your name "); // (Message will send the user...)

        String name = obj.nextLine(); //( nextLine- reads String input and store given Variable.it reads  it will be read by using  scanner object ...)
        System.out.println("You have entered name as "+name);
    }
  // ***********************************************************************************************//
    public void readInteger(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please inter your age ");
        int age = obj.nextInt();
        System.out.println("You have enter age as "+age);
    }
    //*************************************************************************************************//

    public void readDecimal(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please inter your salary ");
        double salary = obj.nextDouble();                  // (Only read for Decimal value
        System.out.println("You have enter salary as "+salary);
    }
    //**************************************************************************************************//
    public static void main(String[] args) {
        Demo_Scanner obj = new Demo_Scanner();// (We will  Create  object for calling ...)
        obj.readInput();      //(Then will call the method....)
        obj.readInteger();
        obj.readDecimal();
    }

}
