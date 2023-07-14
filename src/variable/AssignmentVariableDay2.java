package variable;

public class AssignmentVariableDay2 {
    public static int getSquare(int number) {
        return number * number;
    }
        public static void main (String[]args){
            //write a code for making square of number
        int number = 8;
        System.out.println("Square of " + number + " is: " + getSquare(number));

        //write a code for making cube of number
            int a=4;
            int volume=a*a*a;
            System.out.println("Volume ot the cube = "+volume);

//write a code to calculate %    number * pecentage/100
        //  200*10/100 == 20
            int marks = 600;
            System.out.println("Student obtained marks: " +marks);
            int totalMarks = 800;
            System.out.println("Student total marks: " +totalMarks);
            int doublePercentage = (600*10/100);
            System.out.println("Calculating ten Percentage from obtained marks by the student is "+doublePercentage);


    }
}